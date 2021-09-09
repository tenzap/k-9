package com.fsck.k9.preferences

/**
 * Stores a snapshot of the app's general settings.
 *
 * When adding a setting here, make sure to also add it in these places:
 * - [GeneralSettingsManager] (write function)
 * - [RealGeneralSettingsManager.loadGeneralSettings]
 * - [RealGeneralSettingsManager.writeSettings]
 * - [GeneralSettingsDescriptions]
 */
// TODO: Move over settings from K9
data class GeneralSettings(
    val backgroundSync: BackgroundSync,
    val showRecentChanges: Boolean,
    val preferredContentType: PrefContentType
)

enum class BackgroundSync {
    ALWAYS,
    NEVER,
    FOLLOW_SYSTEM_AUTO_SYNC
}

enum class PrefContentType {
    TEXT_HTML,
    TEXT_PLAIN
}
