package com.ekahau.prototypes.khtf.libe

/**
 * Simple service that store list of strings.
 * This service is used by other classes in this component.
 */
internal class HistoryService(
        initialValue: String) {

    private val historyList: MutableList<String> = mutableListOf()

    init {
        historyList.add(initialValue)
    }

    fun addValue(value: String) {
        historyList.add(value)
    }

    fun getSize(): Int {
        return historyList.size
    }

    fun getLastValue(): String {
        return historyList.last()
    }

    /**
     * Serialize to string.
     */
    fun getString(): String {
        return "\n" + historyList.joinToString("\n ", "", "", -1, "") {it}
    }
}