package com.diegovr17.miu_navigationdrawer

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var etUsuario: EditText
    lateinit var etPassword: EditText

    lateinit var ButtonLogin: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUsuario = findViewById(R.id.etUsuario) as EditText
        etPassword  = findViewById(R.id.etPassword) as EditText

        ButtonLogin = findViewById(R.id.ButtonLog) as Button


        var User: String = "diego"
        var Pass: String = "000000"
        var ban1 = 0



        ButtonLogin.setOnClickListener(View.OnClickListener {


            var Usuario: String = etUsuario.text.toString()
            var Password: String = etPassword.text.toString()



            if (Usuario == ""){
                Toast.makeText(this, "Introduzca un nombre de usuario", Toast.LENGTH_SHORT).show()

            }
            else if (Password == ""){
                Toast.makeText(this, "Introduzca la contraseña para: " + Usuario, Toast.LENGTH_SHORT).show()

            }
            else{
                if (Usuario == User) ban1 += 1

                if (Password == Pass) ban1 += 1

                if (ban1 == 2) {
                    Toast.makeText(this, "Sesión iniciada", Toast.LENGTH_SHORT).show()
                    goToMainActivity()
                } else {
                    Toast.makeText(this, "Usuario o contraseña erroneos", Toast.LENGTH_SHORT).show()
                }
            }

        })
    }
    private fun goToMainActivity() {
        var intent = Intent(this,MainActivity::class.java)
        etUsuario.text.clear()
        etPassword.text.clear()
        startActivity(intent)
        finish()
    }
}
