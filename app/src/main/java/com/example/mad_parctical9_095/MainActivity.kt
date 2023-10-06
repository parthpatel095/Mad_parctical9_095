package com.example.mad_parctical9_095

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmAnimation : AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alarm :ImageView = findViewById(R.id.image)
        alarm.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmAnimation=alarm.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            alarmAnimation.start()
        }
        else{
            alarmAnimation.stop()
        }
    }
}