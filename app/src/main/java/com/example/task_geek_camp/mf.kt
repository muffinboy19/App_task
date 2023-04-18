package com.example.task_geek_camp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class mf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sw)
        val l3 = findViewById<ImageButton>(R.id.l3)
        val f3 = findViewById<ImageButton>(R.id.f3)
        val ni3 = findViewById<ImageButton>(R.id.ni3)
        val n3 = findViewById<ImageButton>(R.id.n3)
        val imv3  = findViewById<ImageView>(R.id.imv3)

        val images = arrayOf(
            R.drawable.image,
            R.drawable.m2,
            R.drawable.m3,
        )
        var ci = 0
        n3.setOnClickListener{
            val intent = Intent(this@mf,`if`::class.java)
            startActivity(intent)
        }
        ni3.setOnClickListener {
            imv3.setImageResource(images[ci])
            ci++
            if (ci >= images.size) {
                ci = 0
            }
        }
        l3.setOnClickListener{
            val intent = Intent(this@mf,MainActivity::class.java)
            startActivity(intent)
        }

        f3.setOnClickListener{
            Toast.makeText(this,"Take me to geekHeaven",Toast.LENGTH_LONG).show()
        }


    }
}