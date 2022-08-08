package com.example.igti

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "br.com.igti.igti.MENSAGEM"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensagem(view: View) {
        Log.i("IGTI", "Método enviarmsg chamado.")
        val editText = findViewById<EditText>(R.id.etMensagem)
        val mensagem = editText.text.toString()
        val intent = Intent(this, ExibirMensagemActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, mensagem)
        }
        startActivity(intent)
    }
}