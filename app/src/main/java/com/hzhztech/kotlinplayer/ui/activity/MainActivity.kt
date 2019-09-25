package com.hzhztech.kotlinplayer.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.hzhztech.kotlinplayer.R
import com.hzhztech.kotlinplayer.base.BaseActivity
import com.hzhztech.kotlinplayer.util.FragmentUtil
import com.hzhztech.kotlinplayer.util.ToolBarManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find

class MainActivity : BaseActivity() ,ToolBarManager{
    //线程安全的懒加载
    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolBar()
    }

    override fun initListener() {
        bottomBar.setOnTabSelectListener {
            //it 代表一个未实现方法里面的参数   onTabSelected(@IdRes int tabId); 即是 tabId
            var transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container,FragmentUtil.fragmentUtil.getFragment(it),it.toString())
            transaction.commit()
        }
    }

}
