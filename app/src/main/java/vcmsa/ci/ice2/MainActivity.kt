package vcmsa.ci.ice2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // find the variables by ID
        val textView = findViewById<TextView>(R.id.txtAppTitle)
        val editText = findViewById<EditText>(R.id.editTextSpeed)
        textView.hint = "Enter your speed"
        val button = findViewById<Button>(R.id.button)

        //click on button
        button.setOnClickListener {
            val speedInput = editText.text.toString().toInt()
            // declare warning message as a variable and do if statement
            if (speedInput < 60) {
                    textView.text = "They are driving safely"
                    // else if your speed is greater then 60 and less than 80 then display a warning message.
            } else if (speedInput >=60 && speedInput <= 80) {
                    textView.text = "Warning! Drive carefully!"
                    // else if your speed is greater that 81 and less than 100 than user has to pay R500 fine.
            } else if (speedInput >= 81 && speedInput <= 100) {
                textView.text = "Reched speed limit of 80km/Fine: R500"
                // else if your speed is 101 and more then user has to pay a fine of R2000
            }else if (speedInput >=101) {
                textView.text = "You have reached the speed limit of 80km/Fine: R2000"
                // If the user has input the incorrect data then a warning message will display
                } else {
                    textView.text = "INVALID INPUT! PLEASE ENTER THE CORRECT SPEED"
            }
            }
        }
    }

