package com.example.task_geek_camp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class `if` : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_midpage)
        val l1 = findViewById<ImageButton>(R.id.l1)
        val f1 = findViewById<ImageButton>(R.id.f1)
        val ni1 = findViewById<ImageButton>(R.id.ni1)
        val n1 = findViewById<ImageButton>(R.id.n1)
        val imv1  = findViewById<ImageView>(R.id.imv1)

        val images = arrayOf(
            R.drawable.e1,
            R.drawable.e2,
            R.drawable.e3,
        )
        var ci = 0

        f1.setOnClickListener{
            Toast.makeText(this,"Take me to geekHeaven",Toast.LENGTH_LONG).show()
        }
        n1.setOnClickListener{
            val intent = Intent(this@`if`,be::class.java)
            startActivity(intent)
        }
        ni1.setOnClickListener{
            imv1.setImageResource(images[ci])
            ci++
            if(ci>=images.size){
                ci = 0
        }
        l1.setOnClickListener{
            val intent = Intent(this@`if`,MainActivity::class.java)
            startActivity(intent)
        }

    }

    }
}

