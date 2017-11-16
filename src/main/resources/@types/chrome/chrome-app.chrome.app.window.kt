@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.app.window")
package chrome.app.window

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

external interface ContentBounds {
    var left: Number? get() = definedExternally; set(value) = definedExternally
    var top: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
}
external interface BoundsSpecification {
    var left: Number? get() = definedExternally; set(value) = definedExternally
    var top: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var minWidth: Number? get() = definedExternally; set(value) = definedExternally
    var minHeight: Number? get() = definedExternally; set(value) = definedExternally
    var maxWidth: Number? get() = definedExternally; set(value) = definedExternally
    var maxHeight: Number? get() = definedExternally; set(value) = definedExternally
}
external interface Bounds {
    var left: Number
    var top: Number
    var width: Number
    var height: Number
    var minWidth: Number? get() = definedExternally; set(value) = definedExternally
    var minHeight: Number? get() = definedExternally; set(value) = definedExternally
    var maxWidth: Number? get() = definedExternally; set(value) = definedExternally
    var maxHeight: Number? get() = definedExternally; set(value) = definedExternally
    fun setPosition(left: Number, top: Number)
    fun setSize(width: Number, height: Number)
    fun setMinimumSize(minWidth: Number, minHeight: Number)
    fun setMaximumSize(maxWidth: Number, maxHeight: Number)
}
external interface FrameOptions {
    var type: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var activeColor: String? get() = definedExternally; set(value) = definedExternally
    var inactiveColor: String? get() = definedExternally; set(value) = definedExternally
}
external interface CreateWindowOptions {
    var id: String? get() = definedExternally; set(value) = definedExternally
    var innerBounds: BoundsSpecification? get() = definedExternally; set(value) = definedExternally
    var outerBounds: BoundsSpecification? get() = definedExternally; set(value) = definedExternally
    var minWidth: Number? get() = definedExternally; set(value) = definedExternally
    var minHeight: Number? get() = definedExternally; set(value) = definedExternally
    var maxWidth: Number? get() = definedExternally; set(value) = definedExternally
    var maxHeight: Number? get() = definedExternally; set(value) = definedExternally
    var frame: Any? get() = definedExternally; set(value) = definedExternally
    var bounds: ContentBounds? get() = definedExternally; set(value) = definedExternally
    var alphaEnabled: Boolean? get() = definedExternally; set(value) = definedExternally
    var state: String? get() = definedExternally; set(value) = definedExternally
    var hidden: Boolean? get() = definedExternally; set(value) = definedExternally
    var resizable: Boolean? get() = definedExternally; set(value) = definedExternally
    var singleton: Boolean? get() = definedExternally; set(value) = definedExternally
    var alwaysOnTop: Boolean? get() = definedExternally; set(value) = definedExternally
    var focused: Boolean? get() = definedExternally; set(value) = definedExternally
    var visibleOnAllWorkspaces: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface AppWindow {
    var focus: () -> Unit
    var fullscreen: () -> Unit
    var isFullscreen: () -> Boolean
    var minimize: () -> Unit
    var isMinimized: () -> Boolean
    var maximize: () -> Unit
    var isMaximized: () -> Boolean
    var restore: () -> Unit
    var moveTo: (left: Number, top: Number) -> Unit
    var resizeTo: (width: Number, height: Number) -> Unit
    var drawAttention: () -> Unit
    var clearAttention: () -> Unit
    var close: () -> Unit
    var show: () -> Unit
    var hide: () -> Unit
    var getBounds: () -> ContentBounds
    var setBounds: (bounds: ContentBounds) -> Unit
    var isAlwaysOnTop: () -> Boolean
    var setAlwaysOnTop: (alwaysOnTop: Boolean) -> Unit
    var setVisibleOnAllWorkspaces: (alwaysVisible: Boolean) -> Unit
    var contentWindow: Window
    var id: String
    var innerBounds: Bounds
    var outerBounds: Bounds
    var onBoundsChanged: WindowEvent
    var onClosed: WindowEvent
    var onFullscreened: WindowEvent
    var onMaximized: WindowEvent
    var onMinimized: WindowEvent
    var onRestored: WindowEvent
}
external fun create(url: String, options: CreateWindowOptions? = definedExternally /* null */, callback: ((created_window: AppWindow) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun current(): AppWindow = definedExternally
external fun get(id: String): AppWindow = definedExternally
external fun getAll(): Array<AppWindow> = definedExternally
external fun canSetVisibleOnAllWorkspaces(): Boolean = definedExternally
external interface WindowEvent : chrome.events.Event<() -> Unit>
external var onBoundsChanged: WindowEvent = definedExternally
external var onClosed: WindowEvent = definedExternally
external var onFullscreened: WindowEvent = definedExternally
external var onMaximized: WindowEvent = definedExternally
external var onMinimized: WindowEvent = definedExternally
external var onRestored: WindowEvent = definedExternally
