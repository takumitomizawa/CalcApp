package jp.techacademy.takumi.tomizawa.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import jp.techacademy.takumi.tomizawa.calcapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var result: Double = 0.0
        var first: Double? = 0.0
        var second: Double? = 0.0

        // 足し算
        binding.add.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)

            try {
                first = binding.editText.text.toString().toDouble()
                second = binding.editText2.text.toString().toDouble()
                result = first!! + second!!

                intent.putExtra("Result", result)
                startActivity(intent)
            }catch (e: java.lang.NumberFormatException){
                Toast.makeText(applicationContext, "値を入力してください", Toast.LENGTH_SHORT).show()
            }
        }
        // 引き算
        binding.subtraction.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)

            try {
                first = binding.editText.text.toString().toDouble()
                second = binding.editText2.text.toString().toDouble()
                result = first!! - second!!

                intent.putExtra("Result", result)
                startActivity(intent)
            }catch (e: java.lang.NumberFormatException){
                Toast.makeText(applicationContext, "値を入力してください", Toast.LENGTH_SHORT).show()
            }
        }
        binding.multiplication.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)

            try {
                first = binding.editText.text.toString().toDouble()
                second = binding.editText2.text.toString().toDouble()
                result = first!! * second!!

                intent.putExtra("Result", result)
                startActivity(intent)
            }catch (e: java.lang.NumberFormatException){
                Toast.makeText(applicationContext, "値を入力してください", Toast.LENGTH_SHORT).show()
            }
        }
        binding.division.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)

            try {
                first = binding.editText.text.toString().toDouble()
                second = binding.editText2.text.toString().toDouble()
                result = first!! / second!!

                intent.putExtra("Result", result)
                startActivity(intent)
            }catch (e: java.lang.NumberFormatException){
                Toast.makeText(applicationContext, "値を入力してください", Toast.LENGTH_SHORT).show()
            }
        }
    }
}