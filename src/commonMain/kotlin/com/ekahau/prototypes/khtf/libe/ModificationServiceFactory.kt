package com.ekahau.prototypes.khtf.libe

internal var modificationServiceFactory: ModificationServiceFactory? = null

//// initialization

fun setDefaultModificationServiceData(mod1: String, mod2: String) {
    modificationServiceFactory = ModificationServiceFactory(mod1, mod2)
}

internal fun getDefaultModificationService(): ModificationService {
    return modificationServiceFactory!!.getService()
}

/**
 * Provide default service for convenience
 */
internal class ModificationServiceFactory(
        private val mod1: String,
        private val mod2: String) {

    private var modificationService: ModificationService? = null

    fun getService(): ModificationService {
        if (modificationService == null) {
            modificationService = ModificationService(mod1, mod2, null)
        }
        return modificationService!!
    }
}