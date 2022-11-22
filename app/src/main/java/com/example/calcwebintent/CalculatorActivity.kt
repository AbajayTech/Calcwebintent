package com.example.calcwebintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var TextAnswer:TextView
    lateinit var Firstnumber:EditText
    lateinit var Secondnumber:EditText
    lateinit var buttonadd:Button
    lateinit var buttonsubtract:Button
    lateinit var buttondivide:Button
    lateinit var buttonmultiply:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        buttonadd=findViewById(R.id.Btn_Add)
        buttonsubtract=findViewById(R.id.Btn_Subtract)
        buttondivide=findViewById(R.id.Btn_Divide)
        buttonmultiply=findViewById(R.id.Btn_Multiply)
        TextAnswer=findViewById(R.id.Txt_Answer)
        Firstnumber=findViewById(R.id.Edt_Fnum)
        Secondnumber=findViewById(R.id.Edt_Snum)

        buttonadd.setOnClickListener {
            var myfirstnumber=Firstnumber.text.toString()
            var mysecondnumber=Secondnumber.text.toString()

            if(myfirstnumber.isEmpty() or  mysecondnumber.isEmpty()){
                TextAnswer.text="Please fill in all inputs"
            }else{
                var myanswer=myfirstnumber.toDouble()+mysecondnumber.toDouble()
                TextAnswer.text=myanswer.toString()
            }
        }
        buttonsubtract.setOnClickListener {
            var myfirstnumber=Firstnumber.text.toString()
            var mysecondnumber=Secondnumber.text.toString()

            if(myfirstnumber.isEmpty() or  mysecondnumber.isEmpty()){
                TextAnswer.text="Please fill in all inputs"
            }else{
                var myanswer=myfirstnumber.toDouble()-mysecondnumber.toDouble()
                TextAnswer.text=myanswer.toString()
            }
        }
        buttondivide.setOnClickListener {
            var myfirstnumber=Firstnumber.text.toString()
            var mysecondnumber=Secondnumber.text.toString()
            if(myfirstnumber.isEmpty() or  mysecondnumber.isEmpty()){
                TextAnswer.text="Please fill in all inputs"
            }else{
                var myanswer=myfirstnumber.toDouble()/mysecondnumber.toDouble()
                TextAnswer.text=myanswer.toString()
            }
        }
        buttonmultiply.setOnClickListener {
            var myfirstnumber=Firstnumber.text.toString()
            var mysecondnumber=Secondnumber.text.toString()
            if(myfirstnumber.isEmpty() or  mysecondnumber.isEmpty()){
                TextAnswer.text="Please fill in all inputs"
            }else{
                var myanswer=myfirstnumber.toDouble()*mysecondnumber.toDouble()
                TextAnswer.text=myanswer.toString()
            }
        }
    }
}