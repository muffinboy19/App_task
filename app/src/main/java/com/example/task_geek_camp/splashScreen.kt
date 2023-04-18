package com.example.task_geek_camp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent

class splashScreen : AppCompatActivity() {
    private val SPLASH_DELAY: Long = 3000 // 3 seconds
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            // Start the main activity after the delay
            val intent = Intent(this@splashScreen, MainActivity::class.java)
            startActivity(intent)
            finish() // finish the splash activity so that the user can't go back to it
        }, SPLASH_DELAY)
    }

}