package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AlamatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alamat)

        val etAlamatNama = findViewById<EditText>(R.id.etAlamatNama)
        etAlamatNama.setText(UserSession.namaUser)

        findViewById<Button>(R.id.btnOrderDanKirim).setOnClickListener {
            val inputNama = etAlamatNama.text.toString().trim()
            if (inputNama.isNotEmpty()) {
                UserSession.namaUser = inputNama
            }
            startActivity(Intent(this, KonfirmasiActivity::class.java))
        }
    }
}