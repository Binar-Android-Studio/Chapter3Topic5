package com.example.chapt3topic5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listStudent = arrayListOf(
            rumahadat("Nanggroe Aceh Darussalam", "Banda Aceh", R.drawable.aceh),
            rumahadat("Sumatra Utara", "Medan", R.drawable.sumatera_utara),
            rumahadat("Sumatra Selatan","Palembang", R.drawable.sumatera_selatan),
            rumahadat("Sumatra Barat", "Padang", R.drawable.sumatera_barat),
            rumahadat("Bengkulu", "Bengkulu", R.drawable.bengkulu),
            rumahadat("Riau", "Pekanbaru", R.drawable.riau),
            rumahadat("Kepulauan Riau", "Tanjung Pinang", R.drawable.kepulauan_riau),
            rumahadat("Lampung", "Bandar Lampung", R.drawable.lampung),
            rumahadat("Bangka Belitung", "Pangkal Pinang", R.drawable.bangka_belitung),

        )

        var adapterStudent = StudentAdapter(listStudent)
        var lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        sumatra.layoutManager = lm
        sumatra.adapter = adapterStudent

        val listStudent2 = arrayListOf(
            rumahadat("Kalimantan Timur", "Samarinda", R.drawable.kalimantan_timur),
            rumahadat("Kalimantan Barat", "Pontianak", R.drawable.kalimantan_barat),
            rumahadat("Kalimantan Tengah","Palangkaraya", R.drawable.kalimantan_tengah),
            rumahadat("Kalimantan Selatan", "Banjar Baru", R.drawable.kalimantan_selatan),
            rumahadat("Kalimantan Utara", "Tanjung Selor", R.drawable.kalimantan_utara)
        )

        var adapterStudent2 = StudentAdapter(listStudent2)
        var lm2 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        kalimantan.layoutManager = lm2
        kalimantan.adapter = adapterStudent2


        val listStudent3 = arrayListOf(
            rumahadat("DKI Jakarta", "Jakarta", R.drawable.dki_jakarta),
            rumahadat("Banten", "Serang", R.drawable.banten),
            rumahadat("Jawa Barat","Bandung", R.drawable.jawa_barat),
            rumahadat("Jawa Tengah", "Semarang", R.drawable.jawa_tengah),
            rumahadat("DI Yogyakarta", "Yogyakarta", R.drawable.d_i_yogyakarta),
            rumahadat("Jawa Timur", "Tanjung", R.drawable.jawa_timur)
        )

        var adapterStudent3 = StudentAdapter(listStudent3)
        var lm3 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        jawa.layoutManager = lm3
        jawa.adapter = adapterStudent3

        val listStudent4 = arrayListOf(
            rumahadat("Bali", "Denpasar", R.drawable.bali),
            rumahadat("Nusa Tenggara Barat", "Mataram", R.drawable.jawa_barat),
            rumahadat("Nusa Tenggara Timur","Kupang", R.drawable.jawa_tengah)
        )

        var adapterStudent4 = StudentAdapter(listStudent4)
        var lm4 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        bali.layoutManager = lm4
        bali.adapter = adapterStudent4

        val listStudent5 = arrayListOf(
            rumahadat("Sulawesi Utara", "Manado", R.drawable.jawa_barat),
            rumahadat("Sulawesi Barat", "Mamuju", R.drawable.dki_jakarta),
            rumahadat("Sulawesi Tengah","Palu", R.drawable.kalimantan_selatan),
            rumahadat("Gorontalo", "Gorontalo", R.drawable.kalimantan_utara),
            rumahadat("Sulawesi Tenggara", "Kendari", R.drawable.kalimantan_timur),
            rumahadat("Sulawesi Selatan", "Makassar", R.drawable.kalimantan_utara)
        )

        var adapterStudent5 = StudentAdapter(listStudent5)
        var lm5 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        sulawesi.layoutManager = lm5
        sulawesi.adapter = adapterStudent5

        val listStudent6 = arrayListOf(
            rumahadat("Sulawesi Utara", "Manado", R.drawable.sumatera_utara),
            rumahadat("Sulawesi Barat", "Mamuju", R.drawable.sumatera_selatan),
            rumahadat("Sulawesi Tengah","Palu", R.drawable.sumatera_selatan),
            rumahadat("Gorontalo", "Gorontalo", R.drawable.bengkulu),
            rumahadat("Sulawesi Tenggara", "Kendari", R.drawable.kepulauan_riau),
            rumahadat("Sulawesi Selatan", "Makassar", R.drawable.riau)
        )

        var adapterStudent6 = StudentAdapter(listStudent6)
        var lm6 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        maluku.layoutManager = lm6
        maluku.adapter = adapterStudent6

        val listStudent7 = arrayListOf(
            rumahadat("Papua Barat", "Manokwari", R.drawable.jawa_tengah),
            rumahadat("Papua", "Jayapura", R.drawable.jawa_tengah),
            rumahadat("Papua Selatan","Kabupaten Merauke", R.drawable.jawa_barat),
            rumahadat("Papua Tengah", "Kabupaten Nabire", R.drawable.dki_jakarta),
        )

        var adapterStudent7 = StudentAdapter(listStudent7)
        var lm7 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        papua.layoutManager = lm7
        papua.adapter = adapterStudent7
    }
}