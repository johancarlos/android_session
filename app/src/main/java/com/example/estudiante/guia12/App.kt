package com.example.estudiante.guia12
import android.app.Application

val session: Prefs by lazy {
    App.prefs!!
}

class App: Application() {
    companion object {
        var prefs: Prefs? = null
    }

    override fun onCreate() {
        prefs = Prefs(applicationContext)
        super.onCreate()
    }
}
