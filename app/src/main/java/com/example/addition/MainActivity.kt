package com.example.addition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n=findViewById<EditText>(R.id.num1)
        val n1=findViewById<EditText>(R.id.num2)

        val n3=findViewById<TextView>(R.id.ans)
        val n4=findViewById<Button>(R.id.button)

        n4.setOnClickListener{
            var a=n.text.toString().toInt()
            var b=n1.text.toString().toInt()

            var e=a+b

            n3.text=e.toString()




        }




    }
}