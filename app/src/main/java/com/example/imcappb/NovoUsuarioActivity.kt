package com.example.imcappb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class NovoUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_usuario)
    }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {

    menuInflater.inflate(R.menu.menu_novo_usuario, menu)

    return true

    }
}
