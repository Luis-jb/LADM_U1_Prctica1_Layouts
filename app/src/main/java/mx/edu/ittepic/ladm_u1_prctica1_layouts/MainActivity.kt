package mx.edu.ittepic.ladm_u1_prctica1_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Listamenu.setOnItemClickListener { parent, view, position, id ->
            when(position){
                0 -> { llamarSegundaActivity() }
                1 -> {
                    //El objeto AlertDialog es ESTATICO, igual que el JOptionPane no requiere variable
                    AlertDialog.Builder(this)
                        .setTitle("ACERCA DE...")
                        .setMessage("(C) RESERVADOS LUIS ALBERTO JACOBO BAÑUELOS")
                        .setPositiveButton("ACEPTAR", { d,i-> d.dismiss() })
                        .setNegativeButton("SALIR",{ d,i -> d.cancel() })
                        .show()
                }
                2 -> { finish() }
            }
        }
    }

    fun llamarSegundaActivity(){
        val otraVentana = Intent(this, MainActivity2::class.java)
                                                    //mandar a llamar el segundo activity
        startActivity(otraVentana)
    }

}