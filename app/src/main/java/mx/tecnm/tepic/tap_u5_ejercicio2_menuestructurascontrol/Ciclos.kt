package mx.tecnm.tepic.tap_u5_ejercicio2_menuestructurascontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ciclos.*

class Ciclos : AppCompatActivity() {
    var cadena = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclos)

        button5.setOnClickListener { finish() }

        button3.setOnClickListener {
            cadena = ""
            for (i in 1..100){
                cadena += i.toString()+" - "
            }
            textView.setText(cadena)
        }

        button4.setOnClickListener {
            cadena = ""
            var i = 0

            while (i<=100){
                //incrementro de 2 en 2
                i += 2
                cadena += i.toString()+" - "
            }
            textView.setText(cadena)
        }

    }
}