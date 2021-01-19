package mx.tecnm.tepic.tap_u5_ejercicio2_menuestructurascontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                                              //Tipo de Obj. Obj.
        ListaPrincipal.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 ->{
                    var condiciones = Intent (this, MainActivity2::class.java)
                    startActivity(condiciones)
                }
                1 ->{
                    var ciclos = Intent (this, Ciclos::class.java)
                    startActivity(ciclos)
                }
                2 ->{
                    var conversiones = Intent (this, MainActivity3::class.java)
                    startActivity(conversiones)
                }
                3 ->{
                    finish()
                }
            }
        }

    }

    //Metodo que lo carga en pantalla
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Clase inflate: toma el contenido y lo convierte a Kotlin
        menuInflater.inflate(R.menu.menucito, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //equivale a SWITCH CASE de java

        when(item.itemId){
            //Equivalente a los case # -> {}
           R.id.opcion1 -> {
               AlertDialog.Builder(this)
                   .setTitle("Acerca de...")
                   .setMessage("Este programa es creado por: Sergio Benigno")
                                                     //Evento
                   .setPositiveButton("Aceptar"){d,i->}
                   .show()
           }
            R.id.opcion2 -> {
                 finish()
            }
        }
        return true
    }

}