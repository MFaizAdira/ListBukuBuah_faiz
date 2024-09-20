package com.faiz.listbukudanbuah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faiz.listbukudanbuah.Adapter.BukuAdapter
import com.faiz.listbukudanbuah.Model.ModelBuku

class RecycleViewActivity : AppCompatActivity() {
    private lateinit var rv_data: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        rv_data = findViewById(R.id.rv_data)

// Define array data
        val listBuku = listOf(
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "Faiz Adira"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "Faiz"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "M Faiz Adira"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "M Faiz"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "Paiss"),
        )
        val nBukuAdapter = BukuAdapter(listBuku)
        rv_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleViewActivity)
            adapter = nBukuAdapter
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}