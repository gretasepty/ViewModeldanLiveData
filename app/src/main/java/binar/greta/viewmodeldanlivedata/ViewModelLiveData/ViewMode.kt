package binar.greta.viewmodeldanlivedata.ViewModelLiveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import binar.greta.viewmodeldanlivedata.R
import kotlinx.android.synthetic.main.activity_view_mode.*

class ViewMode : AppCompatActivity() {
    lateinit var viewModel: TextViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_mode)

        viewModel = ViewModelProvider(this).get(TextViewModel::class.java)

        viewModel.currentNumber.observe(this, Observer {
            txt_angka2.text = it.toString()
        })

        viewModel.currentBoolean.observe(this, Observer {
            txt_boolean.text = it.toString()
        })

        incrementText()


    }

    private fun incrementText(){
        btn_add.setOnClickListener {
            viewModel.currentNumber.value = ++viewModel.number
            viewModel.currentBoolean.value = viewModel.number % 2 == 0
        }
    }
}