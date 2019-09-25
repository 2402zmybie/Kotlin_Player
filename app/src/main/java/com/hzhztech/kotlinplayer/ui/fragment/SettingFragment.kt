package com.hzhztech.kotlinplayer.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceFragment
import android.preference.PreferenceScreen
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hzhztech.kotlinplayer.R
import com.hzhztech.kotlinplayer.ui.activity.AboutActivity
import org.jetbrains.anko.toast

class SettingFragment:PreferenceFragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        addPreferencesFromResource(R.xml.settings_prefs)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onPreferenceTreeClick(preferenceScreen: PreferenceScreen?, preference: Preference?): Boolean {
        //非空判断
        val key = preference?.key
        when(key) {
            "about" -> {
                activity.startActivity(Intent(activity,AboutActivity:: class.java))
            }
        }

        return super.onPreferenceTreeClick(preferenceScreen, preference)
    }
}