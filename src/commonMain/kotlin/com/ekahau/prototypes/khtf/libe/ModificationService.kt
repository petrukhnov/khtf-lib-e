package com.ekahau.prototypes.khtf.libe

/**
 * Service that adjust strings before they added to history service
 */
internal class ModificationService(
        modifier1: String,
        modifier2: String,
        hs: HistoryService?) {

    private val modifier1: String? = modifier1
    private val modifier2: String? = modifier2

    /**
     * Here we don't have to care how historyService was initialized, and which data it requires.
     */
    private val historyService = hs?: historyServiceFactory!!.getService()

    init {
        historyService.addValue("ModificationService.init (${modifier1}, ${modifier2})")
    }

    fun addValue1(value: String) {
        historyService.addValue(modifier1+value)
    }

    fun addValue2(value: String) {
        historyService.addValue(modifier2+value)
    }

    /**
     * Serialize to string.
     */
    fun getString(): String {
        return historyService.getString()
    }
}