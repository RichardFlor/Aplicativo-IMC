package com.example.imcappb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Remover a toolbar
        supportActionBar!!.hide()

        //Instanciar o botão entrar
        val buttonCriarConta = findViewById<Button>(R.id.button_criar_conta)

        //Criar um listener - ouvinte
        buttonCriarConta.setOnClickListener {
            // criar uma intent
            val abrirCadastro = Intent(this, NovoUsuarioActivity::class.java)
            startActivity(abrirCadastro)
        }

    }
}