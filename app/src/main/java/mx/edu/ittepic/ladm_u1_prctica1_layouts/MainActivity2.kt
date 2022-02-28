package mx.edu.ittepic.ladm_u1_prctica1_layouts

import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


      /*  acercade.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Acerca de...")
                .setMessage("(C) Luis Jacobo\nTecnológico de Tepic. LADM")
                .setPositiveButton("OK", {d, i ->})
                .show()
        }*/
    }
}