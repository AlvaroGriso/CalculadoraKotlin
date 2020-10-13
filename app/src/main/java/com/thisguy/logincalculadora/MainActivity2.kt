package com.thisguy.logincalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var nombre = intent.getStringExtra("nombre").toString()

        var apellido = intent.getStringExtra("apellido").toString()

        var textViewNomAp = findViewById<TextView>(R.id.textViewNombreApellido)

        textViewNomAp.text = "Hola " + nombre + " " + apellido

    }



    fun buNumberEvent(view: View) {
        if (isNewOp == true) {
            textViewResultado.setText("")
        }
        isNewOp=false

        val buSelect = view as Button
        var buClickValue: String = textViewResultado.text.toString()

        when (buSelect.id) {
            buttonCero.id -> {
                buClickValue += "0"

            }
            buttonUno.id -> {
                buClickValue += "1"
            }
            buttonDos.id -> {
                buClickValue += "2"
            }
            buttonTres.id -> {
                buClickValue += "3"
            }
            buttonCuatro.id -> {
                buClickValue += "4"
            }
            buttonCinco.id -> {
                buClickValue += "5"
            }
            buttonSeis.id -> {
                buClickValue += "6"
            }
            buttonSiete.id -> {
                buClickValue += "7"
            }
            buttonOcho.id -> {
                buClickValue += "8"
            }
            buttonNueve.id -> {
                buClickValue += "9"
            }
            buttonPunto.id -> {
                buClickValue += "."
            }
        }
        textViewResultado.setText(buClickValue)
    }

    var op = "*"
    var oldNumber = ""
    var isNewOp=true;
    fun buOpenEvent(view: View) {
        var buClickValue: String = textViewResultado.text.toString()

        val buSelect = view as Button
        when (buSelect.id) {
            buttonSuma.id -> {
                op = "+"

            }
            buttonResta.id -> {
                op = "-"
            }
            buttonMult.id -> {
                op = "*"
            }
            buttonDivision.id -> {
                op = "/"
            }
        }
        oldNumber = textViewResultado.text.toString()
        isNewOp = true
    }

    fun buEqualEvent(view: View){
        val newNumber = textViewResultado.text.toString()
        var finalNumber = 0
        when(op){

            "*"->{
                finalNumber = oldNumber.toInt() * newNumber.toInt()

            }
            "/"->{
                finalNumber = oldNumber.toInt()  / newNumber.toInt()
            }
            "+"->{
                finalNumber = oldNumber.toInt()  + newNumber.toInt()
            }
            "-"->{
                finalNumber = oldNumber.toInt()  - newNumber.toInt()
            }
        }
        textViewResultado.setText(finalNumber.toString())
        isNewOp=true
    }
}