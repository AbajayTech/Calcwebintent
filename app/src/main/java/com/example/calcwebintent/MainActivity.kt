package com.example.calcwebintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var buttoncal:Button
    lateinit var buttonintent:Button
    lateinit var buttonweb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        buttoncal=findViewById(R.id.Btn_Calc)
        buttonintent=findViewById(R.id.Btn_Intent)
        buttonweb=findViewById(R.id.Btn_Web)

        buttoncal.setOnClickListener {
            val calc=Intent(this,CalculatorActivity::class.java )
            startActivity(calc)

            Toast.makeText(this," Calculator",Toast.LENGTH_SHORT).show()
        }

        buttonintent.setOnClickListener {
            val inten=Intent(this,IntentActivity::class.java)
            startActivity(inten)

            Toast.makeText(this," Intent",Toast.LENGTH_SHORT).show()
        }
        buttonweb.setOnClickListener {
            val web=Intent(this,WebActivity::class.java)
            startActivity(web)

            Toast.makeText(this," Web",Toast.LENGTH_SHORT).show()
        }
    }
}