package com.ekahau.prototypes.khtf.libe

/**
 * Decorate history with some suffix values.
 */
class DecoratorService(
        suffix: String) {

    private val suffix: String? = " - $suffix - "

    /**
     * Here we don't have to care how historyService was initialized, and which data it requires.
     */
    private val historyService = historyServiceFactory!!.getService()

    init {
        historyService.addValue("DecoratorService.init (${suffix})")
    }

    fun getLastValue(): String {
        return historyService.getLastValue()+suffix
    }

    fun getSize(): String {
        return historyService.getSize().toString()+suffix
    }


    /**
     * Serialize to string.
     */
    fun getString(): String {
        return historyService.getString()+"\n"+suffix+"\n"
    }
}