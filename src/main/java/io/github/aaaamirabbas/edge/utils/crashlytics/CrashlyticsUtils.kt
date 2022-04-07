package io.github.aaaamirabbas.edge.utils.crashlytics

import io.github.aaaamirabbas.edge.ext.logE


object CrashlyticsUtils {
    fun captureException(e: Throwable, className: String? = "") {
        e.printStackTrace()
        "$className: ${e.stackTraceToString()}".logE()
    }
}