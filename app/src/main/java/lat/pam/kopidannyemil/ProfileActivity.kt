package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvHaloProfile = findViewById<TextView>(R.id.tvHaloProfile)
        val etProfileNama = findViewById<EditText>(R.id.etProfileNama)
        val btnSaveProfile = findViewById<Button>(R.id.btnSaveProfile)

        tvHaloProfile.text = "Halo ${UserSession.namaUser},"
        etProfileNama.setText(UserSession.namaUser)

        btnSaveProfile.setOnClickListener {
            val namaBaru = etProfileNama.text.toString().trim()
            if (namaBaru.isNotEmpty()) {
                UserSession.namaUser = namaBaru
                tvHaloProfile.text = "Halo ${UserSession.namaUser},"
                Toast.makeText(this, "Profil berhasil disimpan!", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.btnProfileToHome).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.btnProfileToOrder).setOnClickListener {
            startActivity(Intent(this, AlamatActivity::class.java))
        }
    }
}