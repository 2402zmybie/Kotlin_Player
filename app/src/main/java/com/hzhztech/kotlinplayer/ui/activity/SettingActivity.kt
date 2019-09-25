package com.hzhztech.kotlinplayer.ui.activity

import android.preference.PreferenceManager
import android.support.v7.widget.Toolbar
import com.hzhztech.kotlinplayer.R
import com.hzhztech.kotlinplayer.base.BaseActivity
import com.hzhztech.kotlinplayer.util.ToolBarManager
import org.jetbrains.anko.find

class SettingActivity:BaseActivity(),ToolBarManager {
    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolBar()
        //获取推送通知有没有选中
        val sp = PreferenceManager.getDefaultSharedPreferences(this);
        val push = sp.getBoolean("push",false)
        println("push=${push}")
    }
}