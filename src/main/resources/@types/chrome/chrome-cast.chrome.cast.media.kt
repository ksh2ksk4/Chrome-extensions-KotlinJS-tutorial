@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("chrome.cast.media")
package chrome.cast.media

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

external var DEFAULT_MEDIA_RECEIVER_APP_ID: String = definedExternally
external interface MediaCommand {
    var PAUSE: String
    var SEEK: String
    var STREAM_VOLUME: String
    var STREAM_MUTE: String
}
external interface MetadataType {
    var GENERIC: Number
    var TV_SHOW: Number
    var MOVIE: Number
    var MUSIC_TRACK: Number
    var PHOTO: Number
}
external interface PlayerState {
    var IDLE: String
    var PLAYING: String
    var PAUSED: String
    var BUFFERING: String
}
external interface ResumeState {
    var PLAYBACK_START: String
    var PLAYBACK_PAUSE: String
}
external interface StreamType {
    var BUFFERED: String
    var LIVE: String
    var OTHER: String
}
external interface IdleReason {
    var CANCELLED: String
    var INTERRUPTED: String
    var FINISHED: String
    var ERROR: String
}
external interface RepeatMode {
    var OFF: String
    var ALL: String
    var SINGLE: String
    var ALL_AND_SHUFFLE: String
}
external interface QueueItem {
    var activeTrackIds: Array<Number>
    var autoplay: Boolean
    var customData: Any
    var itemId: Number
    var media: chrome.cast.media.MediaInfo
    var preloadTime: Number
    var startTime: Number
}
external interface QueueLoadRequest {
    var customData: Any
    var items: Array<chrome.cast.media.QueueItem>
    var repeatMode: chrome.cast.media.RepeatMode
    var startIndex: Number
}
external interface QueueInsertItemsRequest {
    var customData: Any
    var insertBefore: Number
    var items: Array<chrome.cast.media.QueueItem>
}
external interface QueueRemoveItemsRequest {
    var customData: Any
    var itemIds: Array<Number>
}
external interface QueueReorderItemsRequest {
    var customData: Any
    var insertBefore: Number
    var itemIds: Array<Number>
}
external interface QueueUpdateItemsRequest {
    var customData: Any
    var item: Array<chrome.cast.media.QueueItem>
}
external interface TrackType {
    var TEXT: String
    var AUDIO: String
    var VIDEO: String
}
external interface TextTrackType {
    var SUBTITLES: String
    var CAPTIONS: String
    var DESCRIPTIONS: String
    var CHAPTERS: String
    var METADATA: String
}
external interface TextTrackEdgeType {
    var NONE: String
    var OUTLINE: String
    var DROP_SHADOW: String
    var RAISED: String
    var DEPRESSED: String
}
external interface TextTrackWindowType {
    var NONE: String
    var NORMAL: String
    var ROUNDED_CORNERS: String
}
external interface TextTrackFontGenericFamily {
    var SANS_SERIF: String
    var MONOSPACED_SANS_SERIF: String
    var SERIF: String
    var MONOSPACED_SERIF: String
    var CASUAL: String
    var CURSIVE: String
    var SMALL_CAPITALS: String
}
external interface TextTrackFontStyle {
    var NORMAL: String
    var BOLD: String
    var BOLD_ITALIC: String
    var ITALIC: String
}
external interface GetStatusRequest {
    var customData: Any
}
external interface PauseRequest {
    var customData: Any
}
external interface PlayRequest {
    var customData: Any
}
external interface SeekRequest {
    var currentTime: Number
    var resumeState: chrome.cast.media.ResumeState
    var customData: Any
}
external interface StopRequest {
    var customData: Any
}
external interface VolumeRequest {
    var volume: chrome.cast.Volume
    var customData: Any
}
external interface LoadRequest {
    var activeTrackIds: Array<Number>
    var autoplay: Boolean
    var currentTime: Number
    var customData: Any
    var media: chrome.cast.media.MediaInfo
}
external interface EditTracksInfoRequest {
    var activeTrackIds: Array<Number>
    var textTrackStyle: chrome.cast.media.TextTrackStyle
}
external interface GenericMediaMetadata {
    var images: Array<chrome.cast.Image>
    var metadataType: chrome.cast.media.MetadataType
    var releaseDate: String
    var releaseYear: Number
    var subtitle: String
    var title: String
    var type: chrome.cast.media.MetadataType
}
external interface MovieMediaMetadata {
    var images: Array<chrome.cast.Image>
    var metadataType: chrome.cast.media.MetadataType
    var releaseDate: String
    var releaseYear: Number
    var subtitle: String
    var title: String
    var studio: String
    var type: chrome.cast.media.MetadataType
}
external interface TvShowMediaMetadata {
    var metadataType: chrome.cast.media.MetadataType
    var seriesTitle: String
    var title: String
    var season: Number
    var episode: Number
    var images: Array<chrome.cast.Image>
    var originalAirdate: String
    var type: chrome.cast.media.MetadataType
    var episodeTitle: String
    var seasonNumber: Number
    var episodeNumber: Number
    var releaseYear: Number
}
external interface MusicTrackMediaMetadata {
    var metadataType: chrome.cast.media.MetadataType
    var albumName: String
    var title: String
    var albumArtist: String
    var artist: String
    var composer: String
    var songName: String
    var trackNumber: Number
    var discNumber: Number
    var images: Array<chrome.cast.Image>
    var releaseDate: String
    var type: chrome.cast.media.MetadataType
    var artistName: String
    var releaseYear: Number
}
external interface PhotoMediaMetadata {
    var metadataType: chrome.cast.media.MetadataType
    var title: String
    var artist: String
    var location: String
    var images: Array<chrome.cast.Image>
    var latitude: Number
    var longitude: Number
    var width: Number
    var height: Number
    var creationDateTime: String
    var type: chrome.cast.media.MetadataType
}
external interface MediaInfo {
    var contentId: String
    var streamType: chrome.cast.media.StreamType
    var contentType: String
    var metadata: Any
    var duration: Number
    var tracks: Array<chrome.cast.media.Track>
    var textTrackStyle: chrome.cast.media.TextTrackStyle
    var customData: Any
}
external interface Media {
    var activeTrackIds: Array<Number>
    var currentItemId: Number
    var customData: Any
    var idleReason: chrome.cast.media.IdleReason
    var items: Array<chrome.cast.media.QueueItem>
    var loadingItemId: Number
    var media: chrome.cast.media.MediaInfo
    var mediaSessionId: Number
    var playbackRate: Number
    var playerState: chrome.cast.media.PlayerState
    var preloadedItemId: Number
    var repeatMode: chrome.cast.media.RepeatMode
    var sessionId: String
    var supportedMediaCommands: Array<chrome.cast.media.MediaCommand>
    var volume: chrome.cast.Volume
    var currentTime: Number
    fun getStatus(getStatusRequest: chrome.cast.media.GetStatusRequest, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun play(playRequest: chrome.cast.media.PlayRequest, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun pause(pauseRequest: chrome.cast.media.PauseRequest, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun seek(seekRequest: chrome.cast.media.SeekRequest, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun stop(stopRequest: chrome.cast.media.StopRequest, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun setVolume(volumeRequest: chrome.cast.media.VolumeRequest, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun editTracksInfo(editTracksInfoRequest: chrome.cast.media.EditTracksInfoRequest, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun supportsCommand(command: chrome.cast.media.MediaCommand): Boolean
    fun addUpdateListener(listener: (isAlive: Boolean) -> Unit)
    fun removeUpdateListener(listener: (isAlive: Boolean) -> Unit)
    fun getEstimatedTime(): Number
    fun queueAppendItem(item: chrome.cast.media.QueueItem, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun queueInsertItems(queueInsertItemsRequest: chrome.cast.media.QueueInsertItemsRequest, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun queueJumpToItem(itemId: Number, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun queueMoveItemToNewIndex(itemId: Number, newIndex: Number, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun queueNext(successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun queuePrev(successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun queueRemoveItem(itemId: Number, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun queueReorderItems(queueReorderItemsRequest: chrome.cast.media.QueueReorderItemsRequest, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun queueSetRepeatMode(repeatMode: chrome.cast.media.RepeatMode, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
    fun queueUpdateItems(queueUpdateItemsRequest: chrome.cast.media.QueueUpdateItemsRequest, successCallback: Function<*>, errorCallback: (error: chrome.cast.Error) -> Unit)
}
external interface Track {
    var trackId: Number
    var trackContentId: String
    var trackContentType: String
    var type: chrome.cast.media.TrackType
    var name: String
    var language: String
    var subtype: chrome.cast.media.TextTrackType
    var customData: Any
}
external interface TextTrackStyle {
    var foregroundColor: String
    var backgroundColor: String
    var edgeType: chrome.cast.media.TextTrackEdgeType
    var edgeColor: String
    var windowType: chrome.cast.media.TextTrackWindowType
    var windowColor: String
    var windowRoundedCornerRadius: Number
    var fontScale: Number
    var fontFamily: String
    var fontGenericFamily: chrome.cast.media.TextTrackFontGenericFamily
    var fontStyle: chrome.cast.media.TextTrackFontStyle
    var customData: Any
}
