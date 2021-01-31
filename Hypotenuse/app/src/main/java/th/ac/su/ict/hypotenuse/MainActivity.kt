package th.ac.su.ict.hypotenuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = findViewById<EditText>(R.id.a)
        val b = findViewById<EditText>(R.id.b)
        val total = findViewById<TextView>(R.id.total)
        val bt = findViewById<TextView>(R.id.solve)
        bt.setOnClickListener(){

            var aNum:Float = a.text.toString().toFloat()
            var bNum:Float = b.text.toString().toFloat()

            var totalNum:Float = ((aNum*aNum)+(bNum*bNum))
            var lastNum: Double = Math.sqrt(totalNum.toDouble())



            total.text = "C =" + lastNum.toString()

        }




    }
}