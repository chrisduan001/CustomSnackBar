package com.example.chris.customsnackbar.view

import android.support.design.widget.BaseTransientBottomBar
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chris.customsnackbar.R
import java.lang.RuntimeException

class CustomSnackBar(parent: ViewGroup, content: SnackBarView)
    : BaseTransientBottomBar<CustomSnackBar>(parent, content, content) {

    init {
        getView().setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.transparent))
        getView().setPadding(0, 0, 0, 0)
    }

    companion object {
        fun make(view: View): CustomSnackBar {
            val parent = view.findSuitableParent() ?: throw RuntimeException("error")

            val customView = LayoutInflater.from(view.context).inflate(
                R.layout.include_snackbar, parent, false
            ) as SnackBarView

            return CustomSnackBar(parent, customView)
        }
    }
}