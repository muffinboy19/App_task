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
        val l2 = findViewById<ImageButton>(R.id.l2)
        val f2 = findViewById<ImageButton>(R.id.f2)
        val ni2 = findViewById<ImageButton>(R.id.ni2)
        val n2 = findViewById<ImageButton>(R.id.n2)
        val imv2  = findViewById<ImageView>(R.id.imv2)

        val images = arrayOf(
            R.drawable.b1,
            R.drawable.b2,
            R.drawable.b3,
        )
        var ci = 0
        n2.setOnClickListener{
            val intent = Intent(this@be,mf::class.java)
            startActivity(intent)
        }
        ni2.setOnClickListener {
            imv2.setImageResource(images[ci])
            ci++
            if (ci >= images.size) {
                ci = 0
            }
        }
        l2.setOnClickListener{
            val intent = Intent(this@be,MainActivity::class.java)
            startActivity(intent)
            }

        f2.setOnClickListener{
            Toast.makeText(this,"Take me to geekHeaven",Toast.LENGTH_LONG).show()
        }
    }
}