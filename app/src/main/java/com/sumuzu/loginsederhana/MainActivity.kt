package com.sumuzu.loginsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = "coro"
        val pass = "coro12"



        btnSignIn.setOnClickListener {
            if (etUsername.text.toString() == user && etPassword.text.toString() == pass){
                val intent = Intent(this,Home::class.java)
                intent.putExtra("user",etUsername.text.toString())
                intent.putExtra("password",etPassword.text.toString())
                startActivity(intent)
                finish()
            }else  {
                Toast.makeText(this,"Username atau Password yg Anda input, SALAH.. yg bner user = coro, password = coro12",Toast.LENGTH_LONG).show()
            }


        }

    }
}