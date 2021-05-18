package disha.home.healthhut

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Doctorthaker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thaker_layout)
        var bookapp=findViewById<Button>(R.id.bookthaker)
        var more1=findViewById<ImageView>(R.id.more1)
        var more2=findViewById<ImageView>(R.id.more2)
        var call=findViewById<ImageView>(R.id.callthaker)
        var vcall=findViewById<ImageView>(R.id.vcthaker)
        var text=findViewById<ImageView>(R.id.textthaker)

        call.setOnClickListener {
            try {
                val callintent = Intent(Intent.ACTION_DIAL)
                callintent.data = Uri.parse("tel:+91123456789")
                startActivity(callintent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }
        text.setOnClickListener {
            try {
                val textintent = Intent(Intent.ACTION_PROCESS_TEXT)
                textintent.data = Uri.parse("I want to book an appointment")
                startActivity(textintent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }


        more1.setOnClickListener {
            try {
                val shrIntent = Intent(this, newexp::class.java)
                startActivity(shrIntent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }
        more2.setOnClickListener {
            try {
                val shrIntent = Intent(this, review::class.java)
                startActivity(shrIntent)
            } catch (ex: Exception) {
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }


        bookapp.setOnClickListener {
            Toast.makeText(this, "APPOINTMENT CONFIRMED", Toast.LENGTH_LONG).show()
        }

    }

}
