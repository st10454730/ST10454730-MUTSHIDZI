package za.ac.iie.st10454730

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




class MainActivity(var result: String) : AppCompatActivity() {


    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_id)


        // egt the button the id i set on the user interface
        val compareButton = findViewById<Button>(R.id.compareButton)

        //get the button the id i set on the user interface
        val clearbutton = findViewById<Button>(R.id.clearButton)

        //get the button the id i set on the user interface
        val ageEditText = findViewById<EditText>(R.id.ageEditText)

        //get the button the id i set on the user interface
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        //add code to the button when it is clicked
        compareButton.setOnClickListener {

            //assign the text in the ageEditText to variable userInput
            val userInput = ageEditText.text.toString()

            // log the user input
            Log.v("MainActivity", "User input :user input")


            //check if the user typed in an age
            if (userInput.isEmpty()) {
                resultTextView.text = ""
            }

            // store age is not a variable
            val userAge = userInput.toIntOrNull()

            // check if the age is not a valid integer
            if (userAge == null) {

                resultTextView.text =
                    "please enter a valid -it must be whole number without and decimals or text"
            } else {

                //check if the age is in the correct range
                if (userAge < 16 || userAge > 100) {
                    resultTextView.text = "Please enter an age between 20 and 100"
                    ageEditText.text.clear()

                } else {

                    //use when to check for age
                    val result = when (userAge) {

                        16 -> "Anne Frank ,she was known for her diary that shared information on how she lived in a basement with other family hiding from Hitler, 16 years"
                        36 -> "Marilyn Monroe ,she was known as a sexy icon that pose for pictures, 36 years"
                        46 -> "John F Kennedy ,JFK was known for being one of the greatest presidents and the common history common, 46 years"
                        52 -> "Grace Kelly,she was an american actress and model and she became a princess,52 years"
                        53 -> "Vladmir Lenin ,he is famous for being a leader of radical socialist Bolshevik party, 53 years"
                        56 -> "Adolf Hitler he was known of being a supreme power individual in history, 56 years"
                        74 -> "Joseph Stalin ,Stalin was famous for taking part in Russian revolution of 1917, 74 years"
                        77 -> "Lucille ball,an amercian actress,77 years"
                        79 -> "Elizabeth Taylor, she was an actress,79 years"
                        82 -> "Mao Zeodong , he was famous for for being a influential leader, 82  years "
                        else -> "Nobody known to me died at this age"
                    }
                    //show output to user
                    resultTextView.text = result
                }

            }
            //clear out the resultTextView and the ageEditText on the clear button click
            clearbutton.setOnClickListener {
                ageEditText.text.clear()
                resultTextView.text = ""
            }
        }

    }
}






















