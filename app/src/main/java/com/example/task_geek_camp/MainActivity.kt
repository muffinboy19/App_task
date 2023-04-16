package com.example.task_geek_camp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //#0047C1

        val fp = findViewById<TextView>(R.id.fp)
        val logo = findViewById<AppCompatButton>(R.id.logo)
        val roll = findViewById<EditText>(R.id.roll)
        val pas = findViewById<EditText>(R.id.pas)
        fp.setOnClickListener{
            Toast.makeText(this,"Remember your Password",Toast.LENGTH_LONG).show()
        }
        roll.setOnClickListener {
            roll.text = null
        }
        pas.setOnClickListener {
            pas.text = null
        }
        logo.setOnClickListener{
            val ds :String = roll.text.toString()
            val ds2 :String = pas.text.toString()
            if(ds=="Enter your enrollment number" || ds2=="Password"){
                Toast.makeText(this,
                    "Please Enter Your Credentials",
                    Toast.LENGTH_LONG).show()
            }
            else if(ds.isEmpty() || ds2.isEmpty()){
                Toast.makeText(this,
                    "Please Enter Your Credentials",
                    Toast.LENGTH_LONG).show()
            }
//            else if(ds2.isEmpty()  && ds.isNotEmpty()){
//                Toast.makeText(this,
//                    "Please Enter Your Password",
//                    Toast.LENGTH_LONG).show()
//            }
//            else if(ds.isEmpty() && ds2.isNotEmpty()){
//                Toast.makeText(this,
//                "Please Enter your Enrollment no.",
//                Toast.LENGTH_LONG).show()
//            }
            else{
                val intent = Intent(this,eff::class.java)
                startActivity(intent)
            }


        }





    }
}