package space.ming.FamApp

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var Change_button1: Button? = null
    var Change_button2: Button? = null
    var Change_button3: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val drawView = findViewById<DrawView>(R.id.thisDrawView)
        val handler = Handler()
        Handler().postDelayed(object : Runnable {
            override fun run() {
                drawView.invalidate()
                handler.postDelayed(this, 400)
            }
        }, 400)
        Change_button1 = findViewById<View>(R.id.Change_button1) as Button
        Change_button1!!.setOnClickListener { drawView.ChangeColor1() }
        Change_button2 = findViewById<View>(R.id.Change_button2) as Button
        Change_button2!!.setOnClickListener { drawView.ChangeColor2() }
        Change_button3 = findViewById<View>(R.id.Change_button3) as Button
        Change_button3!!.setOnClickListener { drawView.ChangeColor3() }
    }
}