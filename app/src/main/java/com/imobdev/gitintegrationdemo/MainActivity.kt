package com.imobdev.gitintegrationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Added in 3rd commit
    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onStart() {
        super.onStart()
    }

    // added in dev11
    private fun sum() {
        val a = 10+20
        Log.e("SUM", ""+a)
    }

    private fun substract() {
        val a = 20-10
        Log.e("SUM", ""+a)
    }

    private fun multiply() {
        val a = 20*10
        Log.e("Multiplication", ""+a)
    }
}
