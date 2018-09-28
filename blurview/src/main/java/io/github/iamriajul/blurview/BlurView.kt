package io.github.iamriajul.blurview

import android.content.Context
import android.graphics.Canvas
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.view.View

class BlurView : View {

    fun hide() {
        gone()
    }

    fun show() {
        visible()
    }

    fun visible() {
        this.visibility = View.VISIBLE
    }

    fun gone() {
        this.visibility = View.GONE
    }

    fun invisible() {
        this.visibility = View.INVISIBLE
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        // ...
    }

    constructor(context: Context, attrs: AttributeSet) : this(context, attrs, 0) {}

    override fun onDraw(canvas: Canvas?) {
        this.alpha = 0.4f
        setBackgroundColor(ContextCompat.getColor(context, android.R.color.darker_gray))
        isClickable = true
        isFocusable = true
        super.onDraw(canvas)
    }
}