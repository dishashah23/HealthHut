package disha.home.healthhut

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard_layout)
        var appointment = findViewById<ImageView>(R.id.ap)
        var med = findViewById<ImageView>(R.id.md)
        var drshah = findViewById<ImageView>(R.id.drs)
        var drthaker = findViewById<ImageView>(R.id.drt)

        appointment.setOnClickListener {
            try {
                val shrIntent = Intent(this, Appoint::class.java)
                startActivity(shrIntent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }
        med.setOnClickListener {
            try {
                val shrIntent = Intent(this, Medicine::class.java)
                startActivity(shrIntent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }
        drshah.setOnClickListener {
            try {
                val shrIntent = Intent(this, Doctorshah::class.java)
                startActivity(shrIntent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }

        drthaker.setOnClickListener {
            try {
                val shrIntent = Intent(this, Doctorthaker::class.java)
                startActivity(shrIntent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }

        }
    }
}



