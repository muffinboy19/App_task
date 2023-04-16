package com.example.task_geek_camp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class sw : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sw)
        val back = findViewById<ImageButton>(R.id.back3)
        val flow = findViewById<ImageButton>(R.id.flower3)
        val side = findViewById<ImageButton>(R.id.side3)
        val imv = findViewById<ImageView>(R.id.imv3)
        val ib = findViewById<ImageButton>(R.id.ib3)
        var ci = 0
        val images = arrayOf(
            R.drawable.s1,
            R.drawable.s2,
            R.drawable.s3,
        )
        ib.setOnClickListener{
            val intent = Intent(this@sw,eff::class.java)
            startActivity(intent)
        }

        flow.setOnClickListener{
            Toast.makeText(this,"Take me to geekHeaven", Toast.LENGTH_LONG).show()
        }
        back.setOnClickListener{
            val intent = Intent(this@sw,MainActivity::class.java)
            startActivity(intent)
        }
        side.setOnClickListener {
            imv.setImageResource(images[ci])
            ci++
            if (ci >= images.size) {
                ci = 0
            }
        }


    }
}