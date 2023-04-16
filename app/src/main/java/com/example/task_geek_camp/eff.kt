package com.example.task_geek_camp

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random
import androidx.core.content.ContextCompat

class eff : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_midpage)
        val back = findViewById<ImageButton>(R.id.back)
        val flow = findViewById<ImageButton>(R.id.flower)
        val side = findViewById<ImageButton>(R.id.side)
        val imv = findViewById<ImageView>(R.id.imv)
        val ib = findViewById<ImageButton>(R.id.ib2)
        val images = arrayOf(
            R.drawable.ee1,
            R.drawable.e2,
            R.drawable.e3,
        )
        var ci = 0
        ib.setOnClickListener{
            val intent = Intent(this@eff,be::class.java)
            startActivity(intent)
        }
        side.setOnClickListener{
            imv.setImageResource(images[ci])
            ci++
            if(ci>=images.size){
                ci = 0
        }
        back.setOnClickListener{
            val intent = Intent(this@eff,MainActivity::class.java)
            startActivity(intent)
        }
        flow.setOnClickListener{
            Toast.makeText(this,"Take me to geekHeaven",Toast.LENGTH_LONG).show()
        }
    }

    }
}

