package com.faiz.listbukudanbuah

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import com.faiz.listbukudanbuah.RecycleBuahActivity

class MainActivity : AppCompatActivity() {
    private lateinit var txtJudul: TextView
    private  lateinit var btnBuku: Button
    private lateinit var btnList: Button
    private lateinit var btnBuah: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContentView(R.layout.activity_main)

        txtJudul = findViewById(R.id.txtJudul)
        btnBuku = findViewById(R.id.btnBuku)
        btnList = findViewById(R.id.btnList)
        btnBuah = findViewById(R.id.btnBuah)

        btnList.setOnClickListener {
            val intentToList = Intent(this@MainActivity, List::class.java)
            startActivity(intentToList)
        }

        btnBuku.setOnClickListener {
            val intentToRecycleView = Intent(this@MainActivity, RecycleViewActivity::class.java)
            startActivity(intentToRecycleView)
        }

        btnBuah.setOnClickListener {
            val intentToRecycleBuah = Intent(this@MainActivity, RecycleBuahActivity::class.java)
            startActivity(intentToRecycleBuah)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
