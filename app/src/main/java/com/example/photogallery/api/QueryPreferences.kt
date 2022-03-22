package com.example.photogallery.api

import android.content.Context
import android.preference.PreferenceManager
import androidx.core.content.edit

private const val PREF_SEARCH_QUERY = "searchQuery"

object QueryPreferences {

    fun getStoreQuery(context: Context): String {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        return prefs.getString(PREF_SEARCH_QUERY, "")!!
    }
     fun setSroredQuery(context: Context, query: String) {
         PreferenceManager.getDefaultSharedPreferences(context)
             .edit {
                 this.putString(PREF_SEARCH_QUERY, query) }
     }
}