package disha.home.healthhut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var signupbtn=findViewById<Button>(R.id.signup)
        var login=findViewById<Button>(R.id.login)
        var nurse=findViewById<ImageView>(R.id.imageView)

        signupbtn.setOnClickListener {
            try{
                val shrIntent= Intent(this,Signup::class.java)
                val animation = AnimationUtils.loadAnimation(this,R.anim.fade)
                signupbtn.startAnimation(animation)
                login.startAnimation(animation)
                nurse.startAnimation(animation)
                startActivity(shrIntent)
            }catch (ex: Exception){
                Toast.makeText(this, ex.message, Toast.LENGTH_LONG).show()
            }
        }
    }
}