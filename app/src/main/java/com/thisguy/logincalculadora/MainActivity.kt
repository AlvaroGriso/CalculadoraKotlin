package com.thisguy.logincalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun saltar(view: View) {

        var editTxtNombre = findViewById<EditText>(R.id.editTextNombre)
        var editTxtApellido = findViewById<EditText>(R.id.editTextTApellido)

        var nombre: String = editTxtNombre.text.toString()
        var apellido: String = editTxtApellido.text.toString()


            var miIntent = Intent(this, MainActivity2::class.java)

            miIntent.putExtra("nombre", nombre)
            miIntent.putExtra("apellido", apellido)

            startActivity(miIntent)
            //finish()

    }

    fun salir(view: View){

        finish()
    }
}