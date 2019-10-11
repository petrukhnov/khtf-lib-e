package com.ekahau.prototypes.khtf.libe

import kotlin.native.concurrent.ThreadLocal

/**
 * This service is not using history service, or have any state. It is marked as thread local, so could bse used in any thread in ios.
 */
@ThreadLocal
class IndependentService {

    fun format(s: String): String {
        return "--- $s ---"
    }
}