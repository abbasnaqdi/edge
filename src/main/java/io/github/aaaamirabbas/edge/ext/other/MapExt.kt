package io.github.aaaamirabbas.edge.ext.other

fun Map<*, *>.logE(tag: String = "", throwable: Throwable? = null) {
    this.forEach {
        "${it.key}: ${it.value}".logE(tag, throwable)
    }
}