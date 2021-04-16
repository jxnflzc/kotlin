package io.github.jxnflzc.kotlin.observer

interface Observer {
    fun <T: Any?> update(msg: T)
}
