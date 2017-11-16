@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.mediaGalleries")
package chrome.mediaGalleries

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

external interface MediaFileSystemsOptions {
    var interactive: dynamic /* Any /* "no" */ | Any /* "yes" */ | Any /* "if_needed" */ */ get() = definedExternally; set(value) = definedExternally
}
external interface MediaFileSystemMetadata {
    var name: String
    var galleryId: String
    var deviceId: String? get() = definedExternally; set(value) = definedExternally
    var isRemovable: Boolean
    var isMediaDevice: Boolean
    var isAvailable: Boolean
}
external interface MetadataOptions {
    var metadataType: dynamic /* Any /* "all" */ | Any /* "mimeTypeAndTags" */ | Any /* "mimeTypeOnly" */ */
}
external interface `T$0` {
    @nativeGetter
    operator fun get(name: String): String?
    @nativeSetter
    operator fun set(name: String, value: String)
}
external interface RawTag {
    var type: String
    var tags: `T$0`
}
external interface Metadata {
    var mimeType: String
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var xResolution: Number? get() = definedExternally; set(value) = definedExternally
    var yResolution: Number? get() = definedExternally; set(value) = definedExternally
    var duration: Number? get() = definedExternally; set(value) = definedExternally
    var rotation: Number? get() = definedExternally; set(value) = definedExternally
    var cameraMake: String? get() = definedExternally; set(value) = definedExternally
    var cameraModel: String? get() = definedExternally; set(value) = definedExternally
    var exposureTimeSeconds: Number? get() = definedExternally; set(value) = definedExternally
    var flashFired: Boolean? get() = definedExternally; set(value) = definedExternally
    var fNumber: Number? get() = definedExternally; set(value) = definedExternally
    var focalLengthMm: Number? get() = definedExternally; set(value) = definedExternally
    var isoEquivalent: Number? get() = definedExternally; set(value) = definedExternally
    var album: String? get() = definedExternally; set(value) = definedExternally
    var artist: String? get() = definedExternally; set(value) = definedExternally
    var comment: String? get() = definedExternally; set(value) = definedExternally
    var copyright: String? get() = definedExternally; set(value) = definedExternally
    var disc: Number? get() = definedExternally; set(value) = definedExternally
    var genre: String? get() = definedExternally; set(value) = definedExternally
    var language: String? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var track: Number? get() = definedExternally; set(value) = definedExternally
    var rawTags: Array<RawTag>
    var attachedImages: Array<Blob>
}
external interface GalleryWatchResult {
    var galleryId: String
    var success: Boolean
}
external interface GalleryChangedEventArgs {
    var type: dynamic /* Any /* "contents_changed" */ | Any /* "watch_dropped" */ */
    var galleryId: String
}
external interface ScanProgressEventArgs {
    var type: dynamic /* Any /* "start" */ | Any /* "cancel" */ | Any /* "finish" */ | Any /* "error" */ */
    var galleryCount: Number? get() = definedExternally; set(value) = definedExternally
    var audioCount: Number? get() = definedExternally; set(value) = definedExternally
    var imageCount: Number? get() = definedExternally; set(value) = definedExternally
    var videoCount: Number? get() = definedExternally; set(value) = definedExternally
}
external fun getMediaFileSystems(callback: (mediaFileSystems: Array<FileSystem>) -> Unit): Unit = definedExternally
external fun getMediaFileSystems(options: MediaFileSystemsOptions, callback: (mediaFileSystems: Array<FileSystem>) -> Unit): Unit = definedExternally
external fun addUserSelectedFolder(callback: (mediaFileSystems: Array<FileSystem>, selectedFileSystemName: String) -> Unit): Unit = definedExternally
external fun dropPermissionForMediaFileSystem(galleryId: String, callback: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun startMediaScan(): Unit = definedExternally
external fun cancelMediaScan(): Unit = definedExternally
external fun addScanResults(callback: (mediaFileSystems: Array<FileSystem>) -> Unit): Unit = definedExternally
external fun getMediaFileSystemMetadata(mediaFileSystem: FileSystem): MediaFileSystemMetadata = definedExternally
external fun getAllMediaFileSystemMetadata(callback: (metadatas: Array<MediaFileSystemMetadata>) -> Unit): Unit = definedExternally
external fun getMetadata(mediaFile: Blob, callback: (metadata: Metadata) -> Unit): Unit = definedExternally
external fun getMetadata(mediaFile: Blob, options: MetadataOptions, callback: (metadata: Metadata) -> Unit): Unit = definedExternally
external fun addGalleryWatch(galleryId: String, callback: (result: GalleryWatchResult) -> Unit): Unit = definedExternally
external fun removeGalleryWatch(galleryId: String): Unit = definedExternally
external fun getAllGalleryWatch(callback: (galleryIds: Array<String>) -> Unit): Unit = definedExternally
external fun removeAllGalleryWatch(): Unit = definedExternally
external var onGalleryChanged: chrome.events.Event<(args: GalleryChangedEventArgs) -> Unit> = definedExternally
external var onScanProgress: chrome.events.Event<(args: ScanProgressEventArgs) -> Unit> = definedExternally
