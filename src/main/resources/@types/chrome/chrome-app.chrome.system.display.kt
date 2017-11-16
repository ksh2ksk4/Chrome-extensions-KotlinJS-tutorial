@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.system.display")
package chrome.system.display

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

external interface Bounds {
    var left: Number
    var top: Number
    var width: Number
    var height: Number
}
external interface Insets {
    var left: Number
    var top: Number
    var right: Number
    var bottom: Number
}
external interface DisplayInfo {
    var id: String
    var name: String
    var mirroringSourceId: String
    var isPrimary: Boolean
    var isInternal: Boolean
    var isEnabled: Boolean
    var dpiX: Number
    var dpiY: Number
    var rotation: Number
    var bounds: Bounds
    var overscan: Insets
    var workArea: Bounds
}
external interface DisplayProps {
    var mirroringSourceId: String? get() = definedExternally; set(value) = definedExternally
    var isPrimary: Boolean? get() = definedExternally; set(value) = definedExternally
    var overscan: Insets? get() = definedExternally; set(value) = definedExternally
    var rotation: Number? get() = definedExternally; set(value) = definedExternally
    var boundsOriginX: Number? get() = definedExternally; set(value) = definedExternally
    var boundsOriginY: Number? get() = definedExternally; set(value) = definedExternally
}
external interface DisplayChangedEvent : chrome.events.Event<() -> Unit>
external fun getInfo(callback: (info: Array<DisplayInfo>) -> Unit): Unit = definedExternally
external fun setDisplayProperties(id: String, info: DisplayInfo, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external var onDisplayChanged: DisplayChangedEvent = definedExternally
