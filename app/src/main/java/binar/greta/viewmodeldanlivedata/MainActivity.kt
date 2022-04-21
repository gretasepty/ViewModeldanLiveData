package binar.greta.viewmodeldanlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var number = 0
        var viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        txt_angka.text = viewModel.number.toString()

        btn_add.setOnClickListener {
            viewModel.addNumber()
            txt_angka.text = viewModel.number.toString()
//            number++
//            txt_angka.text = number.toString()

        }
    }
}