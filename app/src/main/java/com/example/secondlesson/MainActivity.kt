package com.example.secondlesson


import android.widget.TextView
import android.os.Bundle
import android.widget.RadioButton
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity : SecondActivity(), View.OnClickListener {
    var textView1: TextView? = null
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var button4: Button? = null
    var button5: Button? = null
    var button6: Button? = null
    var button7: Button? = null
    var button8: Button? = null
    var button9: Button? = null
    var button0: Button? = null
    var buttonDot: Button? = null
    var buttonС: Button? = null
    var buttonPlus: Button? = null
    var buttonEqually: Button? = null
    var buttonPercent: Button? = null
    var buttonMultiply: Button? = null
    var buttonDivide: Button? = null
    var buttonSquare: Button? = null
    var buttonMinus: Button? = null
    var values: Values? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constreint_layout)
        init()
        initView()
        initListeners()
        values = Values()
    }

    private fun init() {
        (findViewById<View>(R.id.dark) as RadioButton).setOnClickListener(this)
        (findViewById<View>(R.id.light) as RadioButton).setOnClickListener(this)
        when (currentStyle) {
            1 -> (findViewById<View>(R.id.dark) as RadioButton).isChecked = true
            2 -> (findViewById<View>(R.id.light) as RadioButton).isChecked = true
        }
    }

    private var currentStyle: Int
        get() {
            val sharedPreferences = getSharedPreferences(KEY_ST, MODE_PRIVATE)
            return sharedPreferences.getInt(KEY_CURRENT_ST, -1)
        }
        private set(currentStyle) {
            val sharedPreferences = getSharedPreferences(KEY_ST, MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putInt(KEY_CURRENT_ST, currentStyle)
            editor.apply()
        }

    private fun getRealStyle(currentTheme: Int): Int {
        return when (currentTheme) {
            light -> R.style.light1
            dark -> R.style.dark1
            else -> 0
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        values!!.currentText = textView1!!.text.toString()
        outState.putSerializable(TAG, values)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        values = savedInstanceState.getSerializable(TAG) as Values?
        textView1!!.text = values!!.currentText
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button1 -> textView1!!.text = values!!.value1.toString()
            R.id.button2 -> textView1!!.text = values!!.value2.toString()
            R.id.button3 -> textView1!!.text = values!!.value3.toString()
            R.id.button4 -> textView1!!.text = values!!.value4.toString()
            R.id.button5 -> textView1!!.text = values!!.value5.toString()
            R.id.button6 -> textView1!!.text = values!!.value6.toString()
            R.id.button7 -> textView1!!.text = values!!.value7.toString()
            R.id.button8 -> textView1!!.text = values!!.value8.toString()
            R.id.button9 -> textView1!!.text = values!!.value9.toString()
            R.id.button0 -> textView1!!.text = values!!.value0.toString()
            R.id.buttonDot -> textView1!!.text = values!!.valueDot
            R.id.buttonC -> textView1!!.text = values!!.valueC
            R.id.buttonPlus -> textView1!!.text = values!!.valuePlus
            R.id.buttonEqually -> textView1!!.text = values!!.valueEqually
            R.id.buttonPercent -> textView1!!.text = values!!.valuePercent
            R.id.buttonMultiply -> textView1!!.text = values!!.valueMultiply
            R.id.buttonDivide -> textView1!!.text = values!!.valueDivide
            R.id.buttonSquare -> textView1!!.text = values!!.valueSquare
            R.id.buttonMinus -> textView1!!.text = values!!.valueMinus
            R.id.dark -> {
                currentStyle = dark
                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
                recreate()
            }
            R.id.light -> {
                currentStyle = light
                val j = Intent(this, MainActivity::class.java)
                startActivity(j)
                recreate()
            }
            else -> {
            }
        }
    }

    private fun initView() {
        textView1 = findViewById(R.id.textView1)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        button0 = findViewById(R.id.button0)
        buttonDot = findViewById(R.id.buttonDot)
        buttonС = findViewById(R.id.buttonC)
        buttonPlus = findViewById(R.id.buttonPlus)
        buttonEqually = findViewById(R.id.buttonEqually)
        buttonPercent = findViewById(R.id.buttonPercent)
        buttonMultiply = findViewById(R.id.buttonMultiply)
        buttonDivide = findViewById(R.id.buttonDivide)
        buttonSquare = findViewById(R.id.buttonSquare)
        buttonMinus = findViewById(R.id.buttonMinus)
    }

    private fun initListeners() {
        button1!!.setOnClickListener(this)
        button2!!.setOnClickListener(this)
        button3!!.setOnClickListener(this)
        button4!!.setOnClickListener(this)
        button5!!.setOnClickListener(this)
        button6!!.setOnClickListener(this)
        button7!!.setOnClickListener(this)
        button8!!.setOnClickListener(this)
        button9!!.setOnClickListener(this)
        button0!!.setOnClickListener(this)
        buttonDot!!.setOnClickListener(this)
        buttonС!!.setOnClickListener(this)
        buttonPlus!!.setOnClickListener(this)
        buttonEqually!!.setOnClickListener(this)
        buttonPercent!!.setOnClickListener(this)
        buttonMultiply!!.setOnClickListener(this)
        buttonDivide!!.setOnClickListener(this)
        buttonSquare!!.setOnClickListener(this)
        buttonMinus!!.setOnClickListener(this)
    }

    companion object {
        var TAG = "values"
    }
}