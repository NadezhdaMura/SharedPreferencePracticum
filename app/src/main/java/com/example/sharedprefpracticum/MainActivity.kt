package com.example.sharedprefpracticum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myPreference = MyPreference(this)
        var getString = myPreference.getString()
        bt_button.setOnClickListener {
            getString = et_text.text.toString()
            myPreference.setString(getString!!)
            counterText.text = myPreference.getString()
        }
        counterText.text = myPreference.getString()
    }
}