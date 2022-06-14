package com.example.calculatricesimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calculatrice(view: View) {
        var chiffre1 = number1.text.toString().toInt()
        var chiffre2 = number2.text.toString().toInt()
        var operation = ""
        var calcul = 0
        when (view.id) {
            R.id.plus -> operation = "+"
            R.id.moins -> operation = "-"
            R.id.diviser -> operation = "/"
            R.id.multiplier -> operation = "*"
        }
        if (operation == "+") {
            calcul = chiffre1 + chiffre2
        } else if (operation == "-") {
            calcul = chiffre1 - chiffre2
        } else if (operation == "/") {
            calcul = chiffre1 / chiffre2
        } else if (operation == "*") {
            calcul = chiffre1 * chiffre2
        }
        resultat.text = calcul.toString()
    }
}