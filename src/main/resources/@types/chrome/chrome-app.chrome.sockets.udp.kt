@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.sockets.udp")
package chrome.sockets.udp

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
    var remoteAddress: String
    var remotePort: Number
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
    var localAddress: String? get() = definedExternally; set(value) = definedExternally
    var localPort: Number? get() = definedExternally; set(value) = definedExternally
}
external fun create(callback: (createInfo: CreateInfo) -> Unit): Unit = definedExternally
external fun create(properties: SocketProperties, callback: (createInfo: CreateInfo) -> Unit): Unit = definedExternally
external fun update(socketId: Number, properties: SocketProperties, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setPaused(socketId: Number, paused: Boolean, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun bind(socketId: Number, address: String, port: Number, callback: (result: Number) -> Unit): Unit = definedExternally
external fun send(socketId: Number, data: ArrayBuffer, address: String, port: Number, callback: (sendInfo: SendInfo) -> Unit): Unit = definedExternally
external fun close(socketId: Number, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun getInfo(socketId: Number, callback: (socketInfo: SocketInfo) -> Unit): Unit = definedExternally
external fun getSockets(callback: (socketInfos: Array<SocketInfo>) -> Unit): Unit = definedExternally
external fun joinGroup(socketId: Number, address: String, callback: (result: Number) -> Unit): Unit = definedExternally
external fun leaveGroup(socketId: Number, address: String, callback: (result: Number) -> Unit): Unit = definedExternally
external fun setMulticastTimeToLive(socketId: Number, ttl: Number, callback: (result: Number) -> Unit): Unit = definedExternally
external fun setMulticastLoopbackMode(socketId: Number, enabled: Boolean, callback: (result: Number) -> Unit): Unit = definedExternally
external fun getJoinedGroups(socketId: Number, callback: (groups: Array<String>) -> Unit): Unit = definedExternally
external fun setBroadcast(socketId: Number, enabled: Boolean, callback: ((result: Number) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external var onReceive: chrome.events.Event<(args: ReceiveEventArgs) -> Unit> = definedExternally
external var onReceiveError: chrome.events.Event<(args: ReceiveErrorEventArgs) -> Unit> = definedExternally
