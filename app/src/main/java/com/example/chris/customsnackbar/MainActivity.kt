package com.example.chris.customsnackbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Button
import com.example.chris.customsnackbar.view.CustomSnackBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_show).setOnClickListener { showSnack() }
    }

    fun showSnack() {
        CustomSnackBar.make(findViewById(R.id.content_view)).show()
    }
}
