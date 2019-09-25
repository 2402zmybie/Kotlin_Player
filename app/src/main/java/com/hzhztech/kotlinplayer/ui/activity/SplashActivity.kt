package com.hzhztech.kotlinplayer.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.hzhztech.kotlinplayer.R
import com.hzhztech.kotlinplayer.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity

class SplashActivity : BaseActivity(), ViewPropertyAnimatorListener {

    override fun onAnimationEnd(p0: View?) {
//        startActivity<MainActivity>()
//        finish()
        startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(p0: View?) {

    }

    override fun onAnimationStart(p0: View?) {

    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        ViewCompat.animate(imageView)
            .scaleX(1.0f)
            .scaleY(1.0f)
            .setListener(this)
            .setDuration(2000)
    }

}
