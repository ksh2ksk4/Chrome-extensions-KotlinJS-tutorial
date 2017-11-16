@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.app.runtime")
package chrome.app.runtime

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface LaunchData {
    var id: String? get() = definedExternally; set(value) = definedExternally
    var items: Array<LaunchDataItem>? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var referrerUrl: String? get() = definedExternally; set(value) = definedExternally
    var isKioskSession: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface LaunchDataItem {
    var entry: FileEntry
    var type: String
}
external interface LaunchedEvent : chrome.events.Event<(launchData: LaunchData) -> Unit>
external interface RestartedEvent : chrome.events.Event<() -> Unit>
external var onLaunched: LaunchedEvent = definedExternally
external var onRestarted: RestartedEvent = definedExternally
