package com.ekahau.prototypes.khtf.libe

/**
 * Use history service directly.
 */
class LibEntryPoint1() {

    private val historyService = historyServiceFactory!!.getService()

    init {
        historyService.addValue("LibEntryPoint1.init ()")
    }

    fun addValue(value: String) {
        historyService.addValue("LibEntry1: "+value)
    }

    fun getString(): String {
        return historyService.getString()
    }
}