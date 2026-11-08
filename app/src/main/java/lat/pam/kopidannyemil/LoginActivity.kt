package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername = findViewById<EditText>(R.id.etLoginUsername)
        val btnLogin = findViewById<Button>(R.id.btnSubmitLogin)

        btnLogin.setOnClickListener {
            val inputUsername = etUsername.text.toString().trim()
            if (inputUsername.isNotEmpty()) {
                UserSession.namaUser = inputUsername
            }
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}