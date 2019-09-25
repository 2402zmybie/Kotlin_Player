package com.hzhztech.kotlinplayer.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.hzhztech.kotlinplayer.R

class HomeItemView:RelativeLayout {
    constructor(context: Context?) :super(context)
    constructor(context: Context?,attrs: AttributeSet? ) :super(context,attrs)
    constructor(context: Context?,attrs: AttributeSet?, defStyleAttr: Int ) :super(context,attrs,defStyleAttr)

    init {
        View.inflate(context, R.layout.item_home,this)
    }
}