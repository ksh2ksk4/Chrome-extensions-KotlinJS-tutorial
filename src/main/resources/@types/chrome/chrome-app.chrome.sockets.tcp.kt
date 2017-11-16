@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.sockets.tcp")
package chrome.sockets.tcp

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
external interface SendInfo {
    var resultCode: Number
    var bytesSent: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ReceiveEventArgs {
    var socketId: Number
    var data: ArrayBuffer
}
external interface ReceiveErrorEventArgs {
    var socketId: Number
    var resultCode: Number
}
external interface SocketProperties {
    var persistent: Boolean? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var bufferSize: Number? get() = definedExternally; set(value) = definedExternally
}
external interface SocketInfo {
    var socketId: Number
    var persistent: Boolean
    var name: String? get() = definedExternally; set(value) = definedExternally
    var bufferSize: Number? get() = definedExternally; set(value) = definedExternally
    var paused: Boolean
    var connected: Boolean
    var localAddress: String? get() = definedExternally; set(value) = definedExternally
    var localPort: Number? get() = definedExternally; set(value) = definedExternally
    var peerAddress: String? get() = definedExternally; set(value) = definedExternally
    var peerPort: Number? get() = definedExternally; set(value) = definedExternally
}
external fun create(callback: (createInfo: CreateInfo) -> Unit): Unit = definedExternally
external fun create(properties: SocketProperties, callback: (createInfo: CreateInfo) -> Unit): Unit = definedExternally
external fun update(socketId: Number, properties: SocketProperties, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setPaused(socketId: Number, paused: Boolean, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setKeepAlive(socketId: Number, enable: Boolean, callback: (result: Number) -> Unit): Unit = definedExternally
external fun setKeepAlive(socketId: Number, enable: Boolean, delay: Number, callback: (result: Number) -> Unit): Unit = definedExternally
external fun setNoDelay(socketId: Number, noDelay: Boolean, callback: (result: Number) -> Unit): Unit = definedExternally
external fun connect(socketId: Number, peerAddress: String, peerPort: Number, callback: (result: Number) -> Unit): Unit = definedExternally
external fun disconnect(socketId: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun send(socketId: Number, data: ArrayBuffer, callback: (sendInfo: SendInfo) -> Unit): Unit = definedExternally
external fun close(socketId: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getInfo(socketId: Number, callback: (socketInfo: SocketInfo) -> Unit): Unit = definedExternally
external fun getSockets(callback: (socketInfos: Array<SocketInfo>) -> Unit): Unit = definedExternally
external var onReceive: chrome.events.Event<(args: ReceiveEventArgs) -> Unit> = definedExternally
external var onReceiveError: chrome.events.Event<(args: ReceiveErrorEventArgs) -> Unit> = definedExternally
