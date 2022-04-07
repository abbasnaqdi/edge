package io.github.aaaamirabbas.edge.ext


fun <T> Collection<T>.logE(tag: String = "", throwable: Throwable? = null) {
    this.forEach {
        it?.logE(tag, throwable)
    }
}
