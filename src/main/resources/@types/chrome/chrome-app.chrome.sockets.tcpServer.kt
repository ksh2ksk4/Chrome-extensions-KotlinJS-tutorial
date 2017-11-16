@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.sockets.tcpServer")
package chrome.sockets.tcpServer

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

external interface CreateInfo {
    var socketId: Number
}
external interface AcceptEventArgs {
    var socketId: Number
    var clientSocketId: Number
}
external interface AcceptErrorEventArgs {
    var socketId: Number
    var resultCode: Number
}
external interface SocketProperties {
    var persistent: Boolean? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
}
external interface SocketInfo {
    var socketId: Number
    var persistent: Boolean
    var name: String? get() = definedExternally; set(value) = definedExternally
    var paused: Boolean
    var localAddress: String? get() = definedExternally; set(value) = definedExternally
    var localPort: Number? get() = definedExternally; set(value) = definedExternally
}
external fun create(callback: (createInfo: CreateInfo) -> Unit): Unit = definedExternally
external fun create(properties: SocketProperties, callback: (createInfo: CreateInfo) -> Unit): Unit = definedExternally
external fun update(socketId: Number, properties: SocketProperties, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setPaused(socketId: Number, paused: Boolean, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun listen(socketId: Number, address: String, port: Number, backlog: Number, callback: (result: Number) -> Unit): Unit = definedExternally
external fun listen(socketId: Number, address: String, port: Number, callback: (result: Number) -> Unit): Unit = definedExternally
external fun disconnect(socketId: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun close(socketId: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getInfo(socketId: Number, callback: (socketInfo: SocketInfo) -> Unit): Unit = definedExternally
external fun getSockets(callback: (socketInfos: Array<SocketInfo>) -> Unit): Unit = definedExternally
external var onAccept: chrome.events.Event<(args: AcceptEventArgs) -> Unit> = definedExternally
external var onAcceptError: chrome.events.Event<(args: AcceptErrorEventArgs) -> Unit> = definedExternally
