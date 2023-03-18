package com.yunusemreaydin.basiccalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun sum(view: View) {
        val textView =  findViewById<TextView>(R.id.result)
        val number1 = findViewById<EditText>(R.id.num1)
        val number2 = findViewById<EditText>(R.id.num2)
        val userInput1 = number1.text.toString()
        val userInput2 = number2.text.toString()
        val result1 = userInput1.toFloatOrNull()
        val result2 = userInput2.toFloatOrNull()
        if(result1 != null && result2 != null){
            val result = summation(number1.text.toString().toFloat(), number2.text.toString().toFloat()).toString()
            textView.text = result
        }else{
            textView.text = "Give me a number!"
        }
    }
    @SuppressLint("SetTextI18n")
    fun subs(view: View) {
        val textView =  findViewById<TextView>(R.id.result)
        val number1 = findViewById<EditText>(R.id.num1)
        val number2 = findViewById<EditText>(R.id.num2)
        val userInput1 = number1.text.toString()
        val userInput2 = number2.text.toString()
        val result1 = userInput1.toFloatOrNull()
        val result2 = userInput2.toFloatOrNull()
        if(result1 != null && result2 != null){
            val result = subtraction(number1.text.toString().toFloat(), number2.text.toString().toFloat()).toString()
            textView.text = result
        }else{
            textView.text = "Give me a number!"
        }
    }
    @SuppressLint("SetTextI18n")
    fun multi(view: View) {
        val textView =  findViewById<TextView>(R.id.result)
        val number1 = findViewById<EditText>(R.id.num1)
        val number2 = findViewById<EditText>(R.id.num2)
        val userInput1 = number1.text.toString()
        val userInput2 = number2.text.toString()
        val result1 = userInput1.toFloatOrNull()
        val result2 = userInput2.toFloatOrNull()
        if(result1 != null && result2 != null){
            val result = multiplication(number1.text.toString().toFloat(), number2.text.toString().toFloat()).toString()
            textView.text = result
        }else{
            textView.text = "Give me a number!"
        }
    }
    @SuppressLint("SetTextI18n")
    fun div(view: View) {
        val textView =  findViewById<TextView>(R.id.result)
        val number1 = findViewById<EditText>(R.id.num1)
        val number2 = findViewById<EditText>(R.id.num2)
        val userInput1 = number1.text.toString()
        val userInput2 = number2.text.toString()
        val result1 = userInput1.toFloatOrNull()
        val result2 = userInput2.toFloatOrNull()
        if(result1 != null && result2 != null){
            val result = division(number1.text.toString().toFloat(), number2.text.toString().toFloat()).toString()
            textView.text = result
        }else{
            textView.text = "Give me a number!"
        }
    }

    //Functions for four basic operations
    private fun summation(a:Float, b:Float) : Float{
        return a + b
    }
    private fun subtraction(a:Float, b:Float) : Float{
        return a - b
    }
    private fun multiplication(a:Float, b:Float) : Float{
        return a * b
    }
    private fun division(a:Float, b:Float) : Float{
        return a / b
    }
}