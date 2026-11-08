package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class MenuItem(
    val nama: String,
    val deskripsi: String,
    val harga: String,
    val imageRes: Int
)

class MenuAdapter(
    private val listMenu: List<MenuItem>,
    private val onItemClick: () -> Unit
) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgMenu: ImageView = view.findViewById(R.id.imgMenu)
        val tvNama: TextView = view.findViewById(R.id.tvNamaMenu)
        val tvDeskripsi: TextView = view.findViewById(R.id.tvDeskripsiMenu)
        val tvHarga: TextView = view.findViewById(R.id.tvHargaMenu)
        val cardItem: CardView = view.findViewById(R.id.cardItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listMenu[position]
        holder.imgMenu.setImageResource(item.imageRes)
        holder.tvNama.text = item.nama
        holder.tvDeskripsi.text = item.deskripsi
        holder.tvHarga.text = item.harga
        holder.cardItem.setOnClickListener { onItemClick() }
    }

    override fun getItemCount(): Int = listMenu.size
}

class HomeActivity : AppCompatActivity() {
    private lateinit var tvHaloHome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tvHaloHome = findViewById(R.id.tvHaloHome)
        val rvMakanan = findViewById<RecyclerView>(R.id.rvMakanan)

        val daftarMenu = listOf(
            MenuItem("Kopi Susu Gula Aren", "• Espresso, susu, gula aren", "Rp 22.000", R.drawable.kopi_gula_aren),
            MenuItem("Donat Cokelat", "• Donat empuk, glaze cokelat", "Rp 12.000", R.drawable.donat_cokelat),
            MenuItem("Sourdough Loaf", "• Roti fermentasi alami", "Rp 35.000", R.drawable.sourdough_loaf),
            MenuItem("Cappuccino", "• Espresso, foam susu lembut", "Rp 25.000", R.drawable.cappuccino),
            MenuItem("Matcha Latte", "• Matcha jepang, susu segar", "Rp 27.000", R.drawable.matcha_latte)
        )

        rvMakanan.layoutManager = LinearLayoutManager(this)
        rvMakanan.adapter = MenuAdapter(daftarMenu) {
            startActivity(Intent(this, AlamatActivity::class.java))
        }

        findViewById<Button>(R.id.btnNavOrder).setOnClickListener {
            startActivity(Intent(this, AlamatActivity::class.java))
        }

        findViewById<Button>(R.id.btnNavProfile).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        tvHaloHome.text = "Halo ${UserSession.namaUser},"
    }
}