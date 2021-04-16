package io.github.jxnflzc.kotlin.observer

import java.util.ArrayList

interface Subject {
    var observers: ArrayList<Observer>

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun <T : Any?> notify(msg: T) {
        for (observer in this.observers) {
            observer.update(msg)
        }
    }
}
