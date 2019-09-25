package com.hzhztech.kotlinplayer.util

import android.support.v4.app.Fragment
import com.hzhztech.kotlinplayer.R
import com.hzhztech.kotlinplayer.base.BaseFragment
import com.hzhztech.kotlinplayer.ui.fragment.HomeFragment
import com.hzhztech.kotlinplayer.ui.fragment.MvFragment
import com.hzhztech.kotlinplayer.ui.fragment.VBangFragment
import com.hzhztech.kotlinplayer.ui.fragment.YueDanFragment

/**
 * 管理Fragment的util类
 * 单例
 */
class FragmentUtil private constructor(){   //私有构造方法
    //先定义四个Fragment  并且四个fragment只会创建一次
    val homeFragment by lazy { HomeFragment() }
    val mvFragment by lazy { MvFragment() }
    val vbangFragment by lazy { VBangFragment() }
    val yuedanFragment by lazy { YueDanFragment() }

    //静态获得fragment对象
    companion object {
        val fragmentUtil by lazy { FragmentUtil() }
    }

    fun getFragment(tabId: Int):BaseFragment {
        when (tabId) {
            R.id.tab_home -> return homeFragment
            R.id.tab_mv -> return mvFragment
            R.id.tab_vlist -> return vbangFragment
            R.id.tab_yue_dan -> return yuedanFragment
        }
        return homeFragment
    }
}