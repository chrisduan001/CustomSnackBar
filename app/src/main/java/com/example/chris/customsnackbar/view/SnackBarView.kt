package com.example.chris.customsnackbar.view

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.design.snackbar.ContentViewCallback
import android.util.AttributeSet
import android.view.View
import android.view.animation.OvershootInterpolator
import com.example.chris.customsnackbar.R
import kotlinx.android.synthetic.main.view_bottom.view.*

class SnackBarView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), ContentViewCallback {

    init {
        View.inflate(context, R.layout.view_bottom, this)
        clipToPadding = false
    }

    override fun animateContentIn(delay: Int, duration: Int) {
        val scaleX = ObjectAnimator.ofFloat(img_head, View.SCALE_X, 0f, 1f)
        val scaleY = ObjectAnimator.ofFloat(img_head, View.SCALE_Y, 0f, 1f)
        val animatorSet = AnimatorSet().apply {
            interpolator = OvershootInterpolator()
            setDuration(500)
            playTogether(scaleX, scaleY)
        }

        animatorSet.start()
    }

    override fun animateContentOut(delay: Int, duration: Int) {

    }
}