package disha.home.healthhut

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_page)
        var ptimg = findViewById<ImageView>(R.id.patientlogo)
        var submit=findViewById<Button>(R.id.submitbtn)

        ptimg.setOnClickListener {
            try {
                val animation1 = AnimationUtils.loadAnimation(this, R.anim.zoom)
                ptimg.startAnimation(animation1)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()

            }

            submit.setOnClickListener {
                try{
                    val shrIntent= Intent(this,Dashboard::class.java)
                    startActivity(shrIntent)

                }
                catch (ex: Exception) {
                    Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}


