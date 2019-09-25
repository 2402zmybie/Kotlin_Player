package com.hzhztech.kotlinplayer.ui.fragment

import android.graphics.Color
import android.support.v7.widget.LinearLayoutManager
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.hzhztech.kotlinplayer.R
import com.hzhztech.kotlinplayer.adapter.HomeAdapter
import com.hzhztech.kotlinplayer.base.BaseFragment
import com.hzhztech.kotlinplayer.model.HomeItemBean
import com.hzhztech.kotlinplayer.util.URLProviderUtil
import kotlinx.android.synthetic.main.fragment_home.*
import okhttp3.*
import org.jetbrains.anko.textColor
import java.io.IOException

class HomeFragment :BaseFragment() {
    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_home,null)
    }

    override fun initListener() {
        //初始化recyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        //适配
        val adapter = HomeAdapter();
        recyclerView.adapter = adapter
    }

    override fun initData() {
        loadDatas()
    }

    private fun loadDatas() {
        val url = URLProviderUtil.getHomeUrl(0,20)
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(url)
            .build()
        client.newCall(request).enqueue(object :Callback{
            override fun onResponse(call: Call, response: Response) {
                val result = response.body()?.string()
                val gson = Gson()
                var homeItemList = gson.fromJson<List<HomeItemBean>>(result,object : TypeToken<List<HomeItemBean>>(){}.type)
                print("获取数据成功" + homeItemList.size)
            }

            override fun onFailure(call: Call, e: IOException) {
                myToast("获取数失败")
            }

        })
    }

}