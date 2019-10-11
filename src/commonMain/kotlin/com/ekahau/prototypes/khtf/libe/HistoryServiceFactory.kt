package com.ekahau.prototypes.khtf.libe

internal var historyServiceFactory: HistoryServiceFactory? = null

//// initialization

fun setDefaultHistoryServiceData(initialValue: String) {
    historyServiceFactory = HistoryServiceFactory(initialValue)
}

internal fun getDefaultHistoryService(): HistoryService {
    return historyServiceFactory!!.getService()
}

/**
 * Provide default service for convenience
 */
internal class HistoryServiceFactory(
        private val initialValue: String) {

    private var historyService: HistoryService? = null

    fun getService(): HistoryService {
        if (historyService == null) {
            historyService = HistoryService(initialValue)
        }
        return historyService!!
    }
}