package com.hzhztech.kotlinplayer.base

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

abstract class BaseActivity: AppCompatActivity(),AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
    }

    /**
     * 初始化数据
     */
    open protected fun initData() {

    }

    /**
     * adapter listener
     */
    open protected fun initListener() {

    }

    /**
     * 获取布局id
     */
    abstract fun getLayoutId():Int

    /**
     * 可在任何线程中弹吐司
     */
    protected fun myToast(msg:String) {
        runOnUiThread {
            toast(msg)
        }
    }

    inline fun <reified T: BaseActivity> startActivityAndFinish() {
        startActivity<T>()
        finish()
    }
}