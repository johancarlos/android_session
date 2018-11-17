package com.example.estudiante.guia12

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson

class Prefs(context:Context) {
    val PREFS_FILENAME = "edu.bo.ucb.pref"
    val KEY_USER ="user"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)

    var user: Usuario
        get() {
            val gson = Gson()
//  Gson gson = new Gson();
            return gson.fromJson(prefs.getString(KEY_USER, null), Usuario::class.java)
            //retrun gson.fromJson(prefs.getString(KEY_USER,null), Usuario.class);
        }
        set(value) {
            val gson = Gson()
//	Gson gson = new Gson();
            val userJson = gson.toJson(value)
//	String userJson =gson.toJson(value);

            prefs.edit().putString(KEY_USER, userJson).apply()
        }
}
