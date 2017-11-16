@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.runtime")
package chrome.runtime

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

external interface `T$1` {
    var scripts: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$2` {
    var background: `T$1`? get() = definedExternally; set(value) = definedExternally
}
external interface `T$3` {
    var uuids: Array<String>? get() = definedExternally; set(value) = definedExternally
    var socket: Boolean? get() = definedExternally; set(value) = definedExternally
    var low_energy: Boolean? get() = definedExternally; set(value) = definedExternally
    var peripheral: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$4` {
    var types: Array<String>? get() = definedExternally; set(value) = definedExternally
    var extensions: Array<String>? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$5` {
    @nativeGetter
    operator fun get(name: String): `T$4`?
    @nativeSetter
    operator fun set(name: String, value: `T$4`)
}
external interface `T$6` {
    var matches: Array<String>
    var title: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$7` {
    @nativeGetter
    operator fun get(name: String): `T$6`?
    @nativeSetter
    operator fun set(name: String, value: `T$6`)
}
external interface `T$8` {
    var vendorId: Number? get() = definedExternally; set(value) = definedExternally
    var productId: Number? get() = definedExternally; set(value) = definedExternally
    var interfaceClass: Number? get() = definedExternally; set(value) = definedExternally
    var interfaceSubclass: Number? get() = definedExternally; set(value) = definedExternally
    var interfaceProtocol: Number? get() = definedExternally; set(value) = definedExternally
}
external interface `T$9` {
    var filters: Array<`T$8`>
}
external interface `T$10` {
    var name: String
    var accessible_resources: Array<String>
}
external interface `T$11` {
    var partitions: Array<`T$10`>? get() = definedExternally; set(value) = definedExternally
}
external var Manifest.app: `T$2`? get() = definedExternally; set(value) = definedExternally
external var Manifest.bluetooth: `T$3`? get() = definedExternally; set(value) = definedExternally
external var Manifest.file_handlers: `T$5`? get() = definedExternally; set(value) = definedExternally
external var Manifest.kiosk_enabled: Boolean? get() = definedExternally; set(value) = definedExternally
external var Manifest.kiosk_only: Boolean? get() = definedExternally; set(value) = definedExternally
external var Manifest.url_handlers: `T$7`? get() = definedExternally; set(value) = definedExternally
external var Manifest.usb_printers: `T$9`? get() = definedExternally; set(value) = definedExternally
external var Manifest.webview: `T$11`? get() = definedExternally; set(value) = definedExternally
