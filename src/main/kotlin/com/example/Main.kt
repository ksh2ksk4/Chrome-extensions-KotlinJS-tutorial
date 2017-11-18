package com.example

//import chrome.tabs.*
import kotlin.browser.document
import kotlin.js.json
import kotlin.js.Json
import org.w3c.dom.events.Event
import org.w3c.dom.HTMLSelectElement

external val chrome: dynamic

fun getCurrentTabUrl(callback: (String) -> Unit) {
    console.log("getCurrentTabUrl start")

    //val queryInfo = json("active" to true, "currentWindow" to true) as QueryInfo
    val queryInfo = json("active" to true, "currentWindow" to true).unsafeCast<dynamic>()

    //chrome.tabs.query(queryInfo, fun(tabs: Array<Tab>) {
    chrome.tabs.query(queryInfo, fun(tabs: Array<dynamic>) {
        console.log("Callback of chrome.tabs.query start")
        callback(requireNotNull(tabs[0].url as String, {"tab.url should be a string"}))
        console.log("Callback of chrome.tabs.query end")
    })

    console.log("getCurrentTabUrl end")
}

fun changeBackgroundColor(color: String) {
    console.log("changeBackgroundColor start")
    //chrome.tabs.executeScript(json("code" to "document.body.style.backgroundColor='$color'") as InjectDetails)
    chrome.tabs.executeScript(json("code" to "document.body.style.backgroundColor='$color'").unsafeCast<dynamic>())
    console.log("changeBackgroundColor end")
}

fun getSavedBackgroundColor(url: String, callback: (String?) -> Unit) {
    console.log("getSavedBackgroundColor start")
    chrome.storage.sync.get(url, fun(items: Json) {
        callback(if (chrome.runtime.lastError !== null) null else items[url]?.toString())
    })
    console.log("getSavedBackgroundColor end")
}

fun saveBackgroundColor(url: String, color: String) {
    console.log("saveBackgroundColor start")
    chrome.storage.sync.set(json(url to color))
    console.log("saveBackgroundColor end")
}

fun main(args: Array<String>) {
    console.log("main start")

    document.addEventListener("DOMContentLoaded", fun(e: Event) {
        console.log("Callback of document.addEventListener start")

        getCurrentTabUrl(fun(url) {
            console.log("Callback of getCurrentTabUrl start")

            val dropdown = document.getElementById("dropdown") as HTMLSelectElement

            getSavedBackgroundColor(url, fun(savedColor) {
                console.log("Callback of getSavedBackgroundColor start")

                if (savedColor !== null) {
                    changeBackgroundColor(savedColor)
                    dropdown.value = savedColor
                }

                console.log("Callback of getSavedBackgroundColor end")
            })

            dropdown.addEventListener("change", fun(e: Event) {
                console.log("Callback of dropdown.addEventListener start")
                changeBackgroundColor(dropdown.value)
                saveBackgroundColor(url, dropdown.value)
                console.log("Callback of dropdown.addEventListener end")
            })

            console.log("Callback of getCurrentTabUrl end")
        })

        console.log("Callback of document.addEventListener end")
    })

    console.log("main end")
}
