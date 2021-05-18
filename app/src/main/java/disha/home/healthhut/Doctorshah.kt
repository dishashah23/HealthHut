package disha.home.healthhut

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Doctorshah : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shah_layout)
        var bookapps=findViewById<Button>(R.id.bookshah)
        var more3=findViewById<ImageView>(R.id.more3)
        var more4=findViewById<ImageView>(R.id.more4)
        var calls=findViewById<ImageView>(R.id.callthaker)
        var texts=findViewById<ImageView>(R.id.textthaker)
        calls.setOnClickListener {
            try {
                val callintent = Intent(Intent.ACTION_DIAL)
                callintent.data = Uri.parse("tel:+91123456789")
                startActivity(callintent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }
        texts.setOnClickListener {
            try {
                val textintent = Intent(Intent.ACTION_PROCESS_TEXT)
                textintent.data = Uri.parse("I want to book an appointment")
                startActivity(textintent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }


        more3.setOnClickListener {
            try {
                val shrIntent = Intent(this, newexp::class.java)
                startActivity(shrIntent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }
        more4.setOnClickListener {
            try {
                val shrIntent = Intent(this, review::class.java)
                startActivity(shrIntent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }


        bookapps.setOnClickListener {
            Toast.makeText(this, "APPOINTMENT CONFIRMED", Toast.LENGTH_LONG).show()
        }


    }

}
