package io.github.jxnflzc.kotlin.log.extension

import java.text.SimpleDateFormat
import java.util.Date

fun Date.getNowDateTime(): String {
    val sdf = SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS")
    return sdf.format(this)
}
