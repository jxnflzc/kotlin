package io.github.jxnflzc.kotlin.log

class LoggerFactory {
    companion object {
        fun getLogger(clazz: Class<*>): Logger {
            return Logger(clazz.name)
        }

        fun getLogger(name: String): Logger {
            return Logger(name)
        }
    }
}
