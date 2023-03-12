package com.calc.smart.asfqw.qwert

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result_text = findViewById<TextView>(R.id.result_text)
        val operation_text = findViewById<TextView>(R.id.operation_input)

        fun setText(element: String) {
            operation_text.append(element)
        }


        val btn_sin = findViewById<Button>(R.id.btn_sin)
        btn_sin.setOnClickListener { setText("sin") }
        val btn_cos = findViewById<Button>(R.id.btn_cos)
        btn_cos.setOnClickListener { setText("cos") }
        val btn_tan = findViewById<Button>(R.id.btn_tan)
        btn_tan.setOnClickListener { setText("tan") }
        val btn_log = findViewById<Button>(R.id.btn_log)
        btn_log.setOnClickListener { setText("log") }
        val btn_sqrt = findViewById<Button>(R.id.btn_sqrt)
        btn_sqrt.setOnClickListener { setText("sqrt") }
        val btn_1 = findViewById<Button>(R.id.btn_one)
        btn_1.setOnClickListener { setText("1") }
        val btn_2 = findViewById<Button>(R.id.btn_two)
        btn_2.setOnClickListener { setText("2") }
        val btn_3 = findViewById<Button>(R.id.btn_three)
        btn_3.setOnClickListener { setText("3") }
        val btn_4 = findViewById<Button>(R.id.btn_four)
        btn_4.setOnClickListener { setText("4") }
        val btn_5 = findViewById<Button>(R.id.btn_five)
        btn_5.setOnClickListener { setText("5") }
        val btn_6 = findViewById<Button>(R.id.btn_six)
        btn_6.setOnClickListener { setText("6") }
        val btn_7 = findViewById<Button>(R.id.btn_seven)
        btn_7.setOnClickListener { setText("7") }
        val btn_8 = findViewById<Button>(R.id.btn_eight)
        btn_8.setOnClickListener { setText("8") }
        val btn_9 = findViewById<Button>(R.id.btn_nine)
        btn_9.setOnClickListener { setText("9") }
        val btn_0 = findViewById<Button>(R.id.btn_zero)
        btn_0.setOnClickListener { setText("0") }
        val btn_div = findViewById<Button>(R.id.btn_div)
        btn_div.setOnClickListener { setText("/") }
        val btn_mult = findViewById<Button>(R.id.btn_mult)
        btn_mult.setOnClickListener { setText("*") }
        val btn_plus = findViewById<Button>(R.id.btn_plus)
        btn_plus.setOnClickListener { setText("+") }
        val btn_minus = findViewById<Button>(R.id.btn_minus)
        btn_minus.setOnClickListener { setText("-") }
        val btn_left = findViewById<Button>(R.id.btn_left)
        btn_left.setOnClickListener { setText("(") }
        val btn_right = findViewById<Button>(R.id.btn_right)
        btn_right.setOnClickListener { setText(")") }

        val btn_equals = findViewById<Button>(R.id.btn_equals)
        btn_equals.setOnClickListener {
            try {
                val equals = ExpressionBuilder(operation_text.text.toString()).build()
                val result = equals.evaluate()
                result_text.text = result.toString()

            } catch (error: Exception) {
                Log.d("Error", "Text: ${error.message}")
            }
        }

        val btn_ac = findViewById<Button>(R.id.btn_ac)
        btn_ac.setOnClickListener {
            result_text.text = ""
            operation_text.text = ""
        }
        val btn_del = findViewById<Button>(R.id.btn_del)
        btn_del.setOnClickListener {
            var textV = operation_text.text.toString()
            operation_text.text = textV.substring(0, textV.length - 1)
            result_text.text = ""
        }


    }
}