@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.cast")
package chrome.cast

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

external interface AutoJoinPolicy {
    var TAB_AND_ORIGIN_SCOPED: String
    var ORIGIN_SCOPED: String
    var PAGE_SCOPED: String
}
external interface DefaultActionPolicy {
    var CREATE_SESSION: String
    var CAST_THIS_TAB: String
}
external interface Capability {
    var VIDEO_OUT: String
    var AUDIO_OUT: String
    var VIDEO_IN: String
    var AUDIO_IN: String
}
external interface ErrorCode {
    var CANCEL: String
    var TIMEOUT: String
    var API_NOT_INITIALIZED: String
    var INVALID_PARAMETER: String
    var EXTENSION_NOT_COMPATIBLE: String
    var EXTENSION_MISSING: String
    var RECEIVER_UNAVAILABLE: String
    var SESSION_ERROR: String
    var CHANNEL_ERROR: String
    var LOAD_MEDIA_FAILED: String
}
external interface ReceiverAvailability {
    var AVAILABLE: String
    var UNAVAILABLE: String
}
external interface SenderPlatform {
    var CHROME: String
    var IOS: String
    var ANDROID: String
}
external interface ReceiverType {
    var CAST: String
    var HANGOUT: String
    var CUSTOM: String
}
external interface ReceiverAction {
    var CAST: String
    var STOP: String
}
external interface SessionStatus {
    var CONNECTED: String
    var DISCONNECTED: String
    var STOPPED: String
}
external var VERSION: Array<Number> = definedExternally
external var isAvailable: Boolean = definedExternally
external fun initialize(apiConfig: chrome.cast.ApiConfig, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit): Unit = definedExternally
external fun requestSession(successCallback: (session: chrome.cast.Session) -> Unit, errorCallback: (error: chrome.cast.Error) -> Unit, sessionRequest: chrome.cast.SessionRequest? = definedExternally /* null */, label: String? = definedExternally /* null */): Unit = definedExternally
external fun requestSessionById(sessionId: String): Unit = definedExternally
external fun addReceiverActionListener(listener: (receiver: chrome.cast.Receiver, receiverAction: chrome.cast.ReceiverAction) -> Unit): Unit = definedExternally
external fun removeReceiverActionListener(listener: (receiver: chrome.cast.Receiver, receiverAction: chrome.cast.ReceiverAction) -> Unit): Unit = definedExternally
external fun logMessage(message: String): Unit = definedExternally
external fun setCustomReceivers(receivers: Array<chrome.cast.Receiver>, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit): Unit = definedExternally
external fun setReceiverDisplayStatus(receiver: chrome.cast.Receiver, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit): Unit = definedExternally
external interface ApiConfig {
    var sessionRequest: chrome.cast.SessionRequest
    var sessionListener: (session: chrome.cast.Session) -> Unit
    var receiverListener: (receiverAvailability: chrome.cast.ReceiverAvailability) -> Unit
    var autoJoinPolicy: chrome.cast.AutoJoinPolicy? get() = definedExternally; set(value) = definedExternally
    var defaultActionPolicy: chrome.cast.DefaultActionPolicy
}
external interface Error {
    var code: chrome.cast.ErrorCode
    var description: String? get() = definedExternally; set(value) = definedExternally
    var details: String? get() = definedExternally; set(value) = definedExternally
}
external interface Image {
    var url: String
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
}
external interface SenderApplication {
    var platform: chrome.cast.SenderPlatform
    var url: String? get() = definedExternally; set(value) = definedExternally
    var packageId: String? get() = definedExternally; set(value) = definedExternally
}
external interface SessionRequest {
    var appId: String
    var capabilities: Array<chrome.cast.Capability>
    var requestSessionTimeout: Number
    var language: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$0` {
    var name: String
}
external interface Session {
    var sessionId: String
    var appId: String
    var displayName: String
    var appImages: Array<chrome.cast.Image>
    var receiver: chrome.cast.Receiver
    var senderApps: Array<chrome.cast.SenderApplication>
    var namespaces: Array<`T$0`>
    var media: Array<chrome.cast.media.Media>
    var status: chrome.cast.SessionStatus
    fun setReceiverVolumeLevel(newLevel: Number, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun setReceiverMuted(muted: Boolean, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun leave(successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun stop(successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun sendMessage(namespace: String, message: String, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun addUpdateListener(listener: (isAlive: Boolean) -> Unit)
    fun removeUpdateListener(listener: (isAlive: Boolean) -> Unit)
    fun addMessageListener(namespace: String, listener: (namespace: String, message: String) -> Unit)
    fun removeMessageListener(namespace: String, listener: (namespace: String, message: String) -> Unit)
    fun addMediaListener(listener: (media: chrome.cast.media.Media) -> Unit)
    fun removeMediaListener(listener: (media: chrome.cast.media.Media) -> Unit)
    fun loadMedia(loadRequest: chrome.cast.media.LoadRequest, successCallback: (media: chrome.cast.media.Media) -> Unit, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun queueLoad(queueLoadRequest: chrome.cast.media.QueueLoadRequest, successCallback: (media: chrome.cast.media.Media) -> Unit, errorCallback: (error: chrome.cast.Error) -> Unit)
}
external interface Receiver {
    var label: String
    var friendlyName: String
    var capabilities: Array<chrome.cast.Capability>
    var volume: chrome.cast.Volume
    var receiverType: chrome.cast.ReceiverType
    var displayStatus: chrome.cast.ReceiverDisplayStatus
}
external interface ReceiverDisplayStatus {
    var statusText: String
    var appImages: Array<chrome.cast.Image>
}
external interface Volume {
    var level: Number? get() = definedExternally; set(value) = definedExternally
    var muted: Boolean? get() = definedExternally; set(value) = definedExternally
}
