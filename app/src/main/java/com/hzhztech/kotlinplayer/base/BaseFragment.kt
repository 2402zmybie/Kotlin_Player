package com.hzhztech.kotlinplayer.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

abstract class BaseFragment:Fragment(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init();
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return initView();
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    open protected fun initData() {

    }

    open protected fun initListener() {

    }

    abstract fun initView(): View?

    open protected fun init() {

    }

    open protected fun myToast(msg:String) {
        context!!.runOnUiThread { toast(msg) }
    }
}