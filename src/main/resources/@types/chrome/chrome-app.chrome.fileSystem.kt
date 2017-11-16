@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.fileSystem")
package chrome.fileSystem

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

external interface AcceptOptions {
    var description: String? get() = definedExternally; set(value) = definedExternally
    var mimeTypes: Array<String>? get() = definedExternally; set(value) = definedExternally
    var extensions: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface ChooseEntryOptions {
    var type: String? get() = definedExternally; set(value) = definedExternally
    var suggestedName: String? get() = definedExternally; set(value) = definedExternally
    var accepts: Array<AcceptOptions>? get() = definedExternally; set(value) = definedExternally
    var acceptsAllTypes: Boolean? get() = definedExternally; set(value) = definedExternally
    var acceptsMultiple: Boolean? get() = definedExternally; set(value) = definedExternally
}
external fun getDisplayPath(entry: Entry, callback: (displayPath: String) -> Unit): Unit = definedExternally
external fun getWritableEntry(entry: Entry, callback: (entry: Entry) -> Unit): Unit = definedExternally
external fun isWritableEntry(entry: Entry, callback: (isWritable: Boolean) -> Unit): Unit = definedExternally
external fun chooseEntry(callback: (entry: Entry) -> Unit): Unit = definedExternally
external fun chooseEntry(callback: (fileEntries: Array<FileEntry>) -> Unit): Unit = definedExternally
external fun chooseEntry(options: ChooseEntryOptions, callback: (entry: Entry) -> Unit): Unit = definedExternally
external fun chooseEntry(options: ChooseEntryOptions, callback: (fileEntries: Array<FileEntry>) -> Unit): Unit = definedExternally
external fun restoreEntry(id: String, callback: (entry: Entry) -> Unit): Unit = definedExternally
external fun isRestorable(id: String, callback: (isRestorable: Boolean) -> Unit): Unit = definedExternally
external fun retainEntry(entry: Entry): String = definedExternally
