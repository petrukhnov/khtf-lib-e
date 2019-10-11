package com.ekahau.prototypes.khtf.libe

/**
 * Use history service through modification service.
 */
class LibEntryPoint2() {

    private val modificationService = modificationServiceFactory!!.getService()

    init {
        modificationService.addValue1("LibEntryPoint2.init ()")
    }

    fun addValue1(value: String) {
        modificationService.addValue1("LibEntry2: "+value)
    }

    fun addValue2(value: String) {
        modificationService.addValue2("LibEntry2: "+value)
    }

    fun getString(): String {
        return modificationService.getString()
    }
}