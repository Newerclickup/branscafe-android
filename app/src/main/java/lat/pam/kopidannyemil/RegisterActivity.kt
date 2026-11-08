package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etNamaLengkap = findViewById<EditText>(R.id.etRegNamaLengkap)
        val etUsername = findViewById<EditText>(R.id.etRegUsername)
        val btnRegister = findViewById<Button>(R.id.btnSubmitRegister)

        btnRegister.setOnClickListener {
            val nama = etNamaLengkap.text.toString().trim()
            val user = etUsername.text.toString().trim()
            if (nama.isNotEmpty()) {
                UserSession.namaUser = nama
            } else if (user.isNotEmpty()) {
                UserSession.namaUser = user
            }
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}