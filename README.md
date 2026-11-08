# ☕ branscafe (Kopi dan Nyemil) — Mobile Ordering App

**branscafe** adalah aplikasi mobile Android untuk pemesanan kopi dan camilan yang dikembangkan berdasarkan wireframe **"Kopi dan Nyemil"** dengan antarmuka modern bertema *Warm Espresso*. Aplikasi ini dibuat untuk memenuhi tugas mata kuliah **Pengembangan Aplikasi Mobile (PAM)**.

---

## ✨ Fitur Utama Aplikasi
Aplikasi ini mengimplementasikan seluruh alur pemesanan sesuai spesifikasi wireframe (8 halaman):
1. **Splash / Welcome Screen**: Halaman pembuka *full-screen* dengan identitas brand **branscafe**, *headline* sambutan, dan navigasi awal.
2. **Sign Up (Member Onboarding)**: Halaman informasi keuntungan member (*Member Perks*) dengan akses menuju pendaftaran akun baru (*Register*) atau masuk akun (*Login*).
3. **Login User**: Formulir autentikasi pengguna menggunakan *Username* dan *Password*.
4. **Register**: Formulir registrasi member baru (*Nama Lengkap*, *Username*, dan *Password*).
5. **Home (Katalog Menu)**: Menampilkan sapaan nama pengguna secara dinamis (`Halo [Nama],`), bilah pencarian visual, serta daftar 5 menu kopi dan camilan menggunakan `RecyclerView`:
   * *Kopi Susu Gula Aren* (Rp 22.000)
   * *Donat Cokelat* (Rp 12.000)
   * *Sourdough Loaf* (Rp 35.000)
   * *Cappuccino* (Rp 25.000)
   * *Matcha Latte* (Rp 27.000)
6. **Profile**: Halaman profil pengguna yang dilengkapi kartu status member (*Gold Coffee Member*), statistik poin/voucher, fitur ubah nama secara *real-time*, serta tombol *Logout*.
7. **Alamat Pengiriman (Order)**: Formulir pengisian nama penerima, alamat pengiriman lengkap, catatan patokan kurir, serta informasi estimasi pengiriman.
8. **Konfirmasi Pesanan**: Halaman bukti penerimaan pesanan (*Order Receipt*) yang menampilkan status kesiapan kurir dan navigasi kembali ke beranda.

---

## 🛠️ Teknologi yang Digunakan
* **IDE**: Android Studio
* **Bahasa Pemrograman**: Kotlin
* **Arsitektur UI**: XML Layout (`LinearLayout`, `FrameLayout`, `ScrollView`, `CardView`, `RecyclerView`, `MaterialButton`)
* **Penyimpanan Sesi**: *In-Memory Session Object* (`UserSession`) dengan *Static Dummy Data*
* **Minimum SDK**: API 27 (Android 8.1 Oreo)

---

## 🚀 Cara Menjalankan Aplikasi
1. **Clone** repository ini ke komputer Anda melalui Terminal / Git Bash:
   ```bash
   git clone [https://github.com/USERNAME_GITHUB_KAMU/NAMA_REPO_KAMU.git](https://github.com/USERNAME_GITHUB_KAMU/NAMA_REPO_KAMU.git)
