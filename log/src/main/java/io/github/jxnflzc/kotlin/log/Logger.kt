package io.github.jxnflzc.kotlin.log

import io.github.jxnflzc.kotlin.log.extension.getNowDateTime
import java.util.Date

class Logger internal constructor(name: String) {
    private var name: String = ""

    init {
        this.name = name
    }

    private fun printLog(content: String, level: LogLevel, vararg params: String) {
        var output = content
        for (param: String in params) {
            output = output.replaceFirst("{}", param.toString())
        }
        println("${Date().getNowDateTime()} [$level] $name - $output")
    }

    fun debug(content: String, vararg params: String) {
        printLog(content, LogLevel.DEBUG, *params)
    }

    fun info(content: String, vararg params: String) {
        printLog(content, LogLevel.INFO, *params)
    }

    fun warn(content: String, vararg params: String) {
        printLog(content, LogLevel.WARN, *params)
    }

    fun error(content: String, vararg params: String) {
        printLog(content, LogLevel.ERROR, *params)
    }

    fun fatal(content: String, vararg params: String) {
        printLog(content, LogLevel.FATAL, *params)
    }

    enum class LogLevel {
        DEBUG, INFO, WARN, ERROR, FATAL;
    }
}
