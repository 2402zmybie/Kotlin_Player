package com.hzhztech.kotlinplayer.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.hzhztech.kotlinplayer.base.BaseFragment
import org.jetbrains.anko.textColor

class VBangFragment :BaseFragment() {
    override fun initView(): View? {
        val tv = TextView(context)
        tv.gravity = Gravity.CENTER
        tv.textColor = Color.RED
        tv.text = javaClass.simpleName
        return tv
    }

}