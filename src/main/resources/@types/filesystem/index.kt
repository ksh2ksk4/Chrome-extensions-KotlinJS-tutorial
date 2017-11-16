@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

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

external interface LocalFileSystem {
    var TEMPORARY: Number
    var PERSISTENT: Number
    fun requestFileSystem(type: Number, size: Number, successCallback: FileSystemCallback, errorCallback: ErrorCallback? = definedExternally /* null */)
    fun resolveLocalFileSystemURL(url: String, successCallback: EntryCallback, errorCallback: ErrorCallback? = definedExternally /* null */)
    fun webkitRequestFileSystem(type: Number, size: Number, successCallback: FileSystemCallback, errorCallback: ErrorCallback? = definedExternally /* null */)
}
external interface LocalFileSystemSync {
    var TEMPORARY: Number
    var PERSISTENT: Number
    fun requestFileSystemSync(type: Number, size: Number): FileSystemSync
    fun resolveLocalFileSystemSyncURL(url: String): EntrySync
    fun webkitRequestFileSystemSync(type: Number, size: Number): FileSystemSync
}
external interface Metadata {
    var modificationTime: Date
    var size: Number
}
external interface Flags {
    var create: Boolean? get() = definedExternally; set(value) = definedExternally
    var exclusive: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface FileSystem {
    var name: String
    var root: DirectoryEntry
}
external interface Entry {
    var isFile: Boolean
    var isDirectory: Boolean
    fun getMetadata(successCallback: MetadataCallback, errorCallback: ErrorCallback? = definedExternally /* null */)
    var name: String
    var fullPath: String
    var filesystem: FileSystem
    fun moveTo(parent: DirectoryEntry, newName: String? = definedExternally /* null */, successCallback: EntryCallback? = definedExternally /* null */, errorCallback: ErrorCallback? = definedExternally /* null */)
    fun copyTo(parent: DirectoryEntry, newName: String? = definedExternally /* null */, successCallback: EntryCallback? = definedExternally /* null */, errorCallback: ErrorCallback? = definedExternally /* null */)
    fun toURL(): String
    fun remove(successCallback: VoidCallback, errorCallback: ErrorCallback? = definedExternally /* null */)
    fun getParent(successCallback: DirectoryEntryCallback, errorCallback: ErrorCallback? = definedExternally /* null */)
}
external interface DirectoryEntry : Entry {
    fun createReader(): DirectoryReader
    fun getFile(path: String, options: Flags? = definedExternally /* null */, successCallback: FileEntryCallback? = definedExternally /* null */, errorCallback: ErrorCallback? = definedExternally /* null */)
    fun getDirectory(path: String, options: Flags? = definedExternally /* null */, successCallback: DirectoryEntryCallback? = definedExternally /* null */, errorCallback: ErrorCallback? = definedExternally /* null */)
    fun removeRecursively(successCallback: VoidCallback, errorCallback: ErrorCallback? = definedExternally /* null */)
}
external interface DirectoryReader {
    fun readEntries(successCallback: EntriesCallback, errorCallback: ErrorCallback? = definedExternally /* null */)
}
external interface FileEntry : Entry {
    fun createWriter(successCallback: FileWriterCallback, errorCallback: ErrorCallback? = definedExternally /* null */)
    fun file(successCallback: FileCallback, errorCallback: ErrorCallback? = definedExternally /* null */)
}
external interface FileSystemCallback {
    @nativeInvoke
    operator fun invoke(filesystem: FileSystem)
}
external interface EntryCallback {
    @nativeInvoke
    operator fun invoke(entry: Entry)
}
external interface FileEntryCallback {
    @nativeInvoke
    operator fun invoke(entry: FileEntry)
}
external interface DirectoryEntryCallback {
    @nativeInvoke
    operator fun invoke(entry: DirectoryEntry)
}
external interface EntriesCallback {
    @nativeInvoke
    operator fun invoke(entries: Array<Entry>)
}
external interface MetadataCallback {
    @nativeInvoke
    operator fun invoke(metadata: Metadata)
}
external interface FileWriterCallback {
    @nativeInvoke
    operator fun invoke(fileWriter: FileWriter)
}
external interface FileCallback {
    @nativeInvoke
    operator fun invoke(file: File)
}
external interface VoidCallback {
    @nativeInvoke
    operator fun invoke()
}
external interface ErrorCallback {
    @nativeInvoke
    operator fun invoke(err: DOMError)
}
external interface FileSystemSync {
    var name: String
    var root: DirectoryEntrySync
}
external interface EntrySync {
    var isFile: Boolean
    var isDirectory: Boolean
    fun getMetadata(): Metadata
    var name: String
    var fullPath: String
    var filesystem: FileSystemSync
    fun moveTo(parent: DirectoryEntrySync, newName: String? = definedExternally /* null */): EntrySync
    fun copyTo(parent: DirectoryEntrySync, newName: String? = definedExternally /* null */): EntrySync
    fun toURL(): String
    fun remove()
    fun getParent(): DirectoryEntrySync
}
external interface DirectoryEntrySync : EntrySync {
    fun createReader(): DirectoryReaderSync
    fun getFile(path: String, options: Flags? = definedExternally /* null */): FileEntrySync
    fun getDirectory(path: String, options: Flags? = definedExternally /* null */): DirectoryEntrySync
    fun removeRecursively()
}
external interface DirectoryReaderSync {
    fun readEntries(): Array<EntrySync>
}
external interface FileEntrySync : EntrySync {
    fun createWriter(): FileWriterSync
    fun file(): File
}
external interface WorkerGlobalScope : LocalFileSystem, LocalFileSystemSync
