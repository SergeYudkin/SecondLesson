package com.example.secondlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.content.Intent
import android.view.View

open class SecondActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(getRealStyle(currentStyle))
        setContentView(R.layout.constreint_layout)
        init()
    }

    private fun init() {
        (findViewById<View>(R.id.dark) as RadioButton).setOnClickListener(this)
        (findViewById<View>(R.id.light) as RadioButton).setOnClickListener(this)
        when (currentStyle) {
            1 -> (findViewById<View>(R.id.dark) as RadioButton).isChecked = true
            2 -> (findViewById<View>(R.id.light) as RadioButton).isChecked = true
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    public override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.dark -> {
                currentStyle = dark
                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
            }
            R.id.light -> {
                currentStyle = light
                val j = Intent(this, MainActivity::class.java)
                startActivity(j)
            }
            else -> {
            }
        }
        recreate()
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

    companion object {
        const val light = 2
        const val dark = 1
        const val KEY_ST = "st"
        const val KEY_CURRENT_ST = "current_st"
    }
}