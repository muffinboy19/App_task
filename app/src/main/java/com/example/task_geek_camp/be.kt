package com.example.task_geek_camp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class be : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_be)
        val back = findViewById<ImageButton>(R.id.back2)
        val flow = findViewById<ImageButton>(R.id.flower2)
        val side = findViewById<ImageButton>(R.id.side2)
        val imv = findViewById<ImageView>(R.id.imv2)
        val ib = findViewById<ImageButton>(R.id.ib)
        val images = arrayOf(
            R.drawable.b1,
            R.drawable.b2,
            R.drawable.b3,
        )
        var ci = 0

        ib.setOnClickListener{
            val intent = Intent(this@be,sw::class.java)
            startActivity(intent)
        }
        back.setOnClickListener{
            val intent = Intent(this@be,MainActivity::class.java)
            startActivity(intent)
        }
        flow.setOnClickListener{
            Toast.makeText(this,"Take me to geekHeaven", Toast.LENGTH_LONG).show()
        }
        side.setOnClickListener{
            imv.setImageResource(images[ci])
            ci++
            if(ci>=images.size){
                ci = 0
            }
        }
    }
}