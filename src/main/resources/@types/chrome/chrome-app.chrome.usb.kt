@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.usb")
package chrome.usb

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

external interface Device {
    var device: Number
    var vendorId: Number
    var productId: Number
    var productName: String
    var manufacturerName: String
    var serialNumber: String
}
external interface ConnectionHandle {
    var handle: Number
    var vendorId: Number
    var productId: Number
}
external interface EndpointDescriptor {
    var address: Number
    var type: dynamic /* Any /* "control" */ | Any /* "interrupt" */ | Any /* "isochronous" */ | Any /* "bulk" */ */
    var direction: dynamic /* Any /* "in" */ | Any /* "out" */ */
    var maximumPacketSize: Number
    var synchronization: dynamic /* Any /* "asynchronous" */ | Any /* "adaptive" */ | Any /* "synchronous" */ */ get() = definedExternally; set(value) = definedExternally
    var usage: dynamic /* Any /* "data" */ | Any /* "feedback" */ | Any /* "explicitFeedback" */ */ get() = definedExternally; set(value) = definedExternally
    var pollingInterval: Number? get() = definedExternally; set(value) = definedExternally
    var extra_data: ArrayBuffer
}
external interface InterfaceDescriptor {
    var interfaceNumber: Number
    var alternateSetting: Number
    var interfaceClass: Number
    var interfaceSubclass: Number
    var interfaceProtocol: Number
    var description: String? get() = definedExternally; set(value) = definedExternally
    var endpoints: Array<EndpointDescriptor>
    var extra_data: ArrayBuffer
}
external interface ConfigDescriptor {
    var active: Boolean
    var configurationValue: Number
    var description: String? get() = definedExternally; set(value) = definedExternally
    var selfPowered: Boolean
    var remoteWakeup: Boolean
    var maxPower: Number
    var interfaces: Array<InterfaceDescriptor>
    var extra_data: ArrayBuffer
}
external interface GenericTransferInfo {
    var direction: dynamic /* Any /* "in" */ | Any /* "out" */ */
    var endpoint: Number
    var length: Number? get() = definedExternally; set(value) = definedExternally
    var data: ArrayBuffer? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
}
external interface TransferResultInfo {
    var resultCode: Number
    var data: ArrayBuffer? get() = definedExternally; set(value) = definedExternally
}
external interface DeviceFilter {
    var vendorId: Number? get() = definedExternally; set(value) = definedExternally
    var productId: Number? get() = definedExternally; set(value) = definedExternally
    var interfaceClass: Number? get() = definedExternally; set(value) = definedExternally
    var interfaceSubclass: Number? get() = definedExternally; set(value) = definedExternally
    var interfaceProtocol: Number? get() = definedExternally; set(value) = definedExternally
}
external interface TransferInfo {
    var direction: dynamic /* Any /* "in" */ | Any /* "out" */ */
    var recipient: dynamic /* Any /* "device" */ | Any /* "interface" */ | Any /* "endpoint" */ | Any /* "other" */ */
    var requestType: dynamic /* Any /* "standard" */ | Any /* "class" */ | Any /* "vendor" */ | Any /* "reserved" */ */
    var request: Number
    var value: Number
    var index: Number
    var length: Number? get() = definedExternally; set(value) = definedExternally
    var data: ArrayBuffer? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
}
external interface DeviceEvent : chrome.events.Event<(device: Device) -> Unit>
external var onDeviceAdded: DeviceEvent = definedExternally
external var onDeviceRemoved: DeviceEvent = definedExternally
external interface `T$12` {
    var vendorId: Number? get() = definedExternally; set(value) = definedExternally
    var productId: Number? get() = definedExternally; set(value) = definedExternally
    var filters: Array<DeviceFilter>? get() = definedExternally; set(value) = definedExternally
}
external fun getDevices(options: `T$12`, callback: (devices: Array<Device>) -> Unit): Unit = definedExternally
external interface `T$13` {
    var multiple: Boolean? get() = definedExternally; set(value) = definedExternally
    var filters: Array<DeviceFilter>? get() = definedExternally; set(value) = definedExternally
}
external fun getUserSelectedDevices(options: `T$13`, callback: (devices: Array<Device>) -> Unit): Unit = definedExternally
external fun getConfigurations(device: Device, callback: (configs: Array<ConfigDescriptor>) -> Unit): Unit = definedExternally
external fun requestAccess(device: Device, interfaceId: Number, callback: (success: Boolean) -> Unit): Unit = definedExternally
external fun openDevice(device: Device, callback: (handle: ConnectionHandle) -> Unit): Unit = definedExternally
external interface `T$14` {
    var vendorId: Number
    var productId: Number
    var interfaceId: Number? get() = definedExternally; set(value) = definedExternally
}
external fun findDevices(options: `T$14`, callback: (handles: Array<ConnectionHandle>) -> Unit): Unit = definedExternally
external fun closeDevice(handle: ConnectionHandle, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun setConfiguration(handle: ConnectionHandle, configurationValue: Number, callback: () -> Unit): Unit = definedExternally
external fun getConfiguration(handle: ConnectionHandle, callback: (config: ConfigDescriptor) -> Unit): Unit = definedExternally
external fun listInterfaces(handle: ConnectionHandle, callback: (descriptors: Array<InterfaceDescriptor>) -> Unit): Unit = definedExternally
external fun claimInterface(handle: ConnectionHandle, interfaceNumber: Number, callback: () -> Unit): Unit = definedExternally
external fun releaseInterface(handle: ConnectionHandle, interfaceNumber: Number, callback: () -> Unit): Unit = definedExternally
external fun setInterfaceAlternateSetting(handle: ConnectionHandle, interfaceNumber: Number, alternateSetting: Number, callback: () -> Unit): Unit = definedExternally
external fun controlTransfer(handle: ConnectionHandle, transferInfo: TransferInfo, callback: (info: TransferResultInfo) -> Unit): Unit = definedExternally
external fun bulkTransfer(handle: ConnectionHandle, transferInfo: GenericTransferInfo, callback: (info: TransferResultInfo) -> Unit): Unit = definedExternally
external fun interruptTransfer(handle: ConnectionHandle, transferInfo: GenericTransferInfo, callback: (info: TransferResultInfo) -> Unit): Unit = definedExternally
external interface `T$15` {
    var transferInfo: GenericTransferInfo
    var packets: Number
    var packetLength: Number
}
external fun isochronousTransfer(handle: ConnectionHandle, transferInfo: `T$15`, callback: (info: TransferResultInfo) -> Unit): Unit = definedExternally
external fun resetDevice(handle: ConnectionHandle, callback: (success: Boolean) -> Unit): Unit = definedExternally
