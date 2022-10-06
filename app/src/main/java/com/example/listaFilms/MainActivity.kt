package com.example.listaFilms

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.igti.R

const val EXTRA_MESSAGE = "MENSAGEM"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensagem(view: View) {
        val editText = findViewById<EditText>(R.id.etMensagem)
        val mensagem = editText.text.toString()
        val intent = Intent(this, ExibirMensagemActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, mensagem)
        }
        startActivity(intent)
    }
}