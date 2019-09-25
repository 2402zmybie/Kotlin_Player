package com.hzhztech.kotlinplayer.util

import android.content.Intent
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.Toast
import com.hzhztech.kotlinplayer.R
import com.hzhztech.kotlinplayer.ui.activity.SettingActivity
import org.jetbrains.anko.startActivity

interface ToolBarManager {
    val toolbar:Toolbar
    /**
     * 初始化主页面的toolbar
     */
    fun initMainToolBar() {
        toolbar.setTitle("老何影音")
        toolbar.inflateMenu(R.menu.menu_main)
//        toolbar.setOnMenuItemClickListener(object : Toolbar.OnMenuItemClickListener {
//            override fun onMenuItemClick(item: MenuItem?): Boolean {
//                //防止空指针
//                when(item?.itemId) {
//                    R.id.setting -> {
//                        // ::class.java  拿到java的class
//                        //跳转到设置界面
//                        toolbar.context.startActivity(Intent(toolbar.context,SettingActivity:: class.java))
//                    }
//                }
//                return true  //代表消费了这个事件
//            }
//
//        })

        //第二种写法
        //如果java接口中只有一个未实现的方法, 可以省略接口对象, 直接用{} 表示未实现的方法
        toolbar.setOnMenuItemClickListener {
            toolbar.context.startActivity(Intent(toolbar.context,SettingActivity:: class.java))
            true
        }
    }

    fun initSettingToolBar() {
        toolbar.setTitle("设置")
    }
}