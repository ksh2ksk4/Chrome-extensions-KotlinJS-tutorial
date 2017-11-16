@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

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

external interface FileSaver : EventTarget {
    fun abort()
    var INIT: Number
    var WRITING: Number
    var DONE: Number
    var readyState: Number
    var error: Error
    var onwritestart: (event: ProgressEvent) -> Unit
    var onprogress: (event: ProgressEvent) -> Unit
    var onwrite: (event: ProgressEvent) -> Unit
    var onabort: (event: ProgressEvent) -> Unit
    var onerror: (event: ProgressEvent) -> Unit
    var onwriteend: (event: ProgressEvent) -> Unit
    companion object : Any by definedExternally: Any {
    }
}
external interface FileWriter : FileSaver {
    var position: Number
    var length: Number
    fun write(data: Blob)
    fun seek(offset: Number)
    fun truncate(size: Number)
}
external interface FileWriterSync {
    var position: Number
    var length: Number
    fun write(data: Blob)
    fun seek(offset: Number)
    fun truncate(size: Number)
}
