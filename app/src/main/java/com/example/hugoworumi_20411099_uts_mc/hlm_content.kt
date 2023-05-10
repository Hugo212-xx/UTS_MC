@file:Suppress("DEPRECATION")

package com.example.hugoworumi_20411099_uts_mc

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class hlm_content : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.content)

        val detail = intent.getParcelableExtra<itemimg>(hlm_home.INTENT_PARCELABLE)

        val img = findViewById<ImageView>(R.id.d_img)
        val name = findViewById<TextView>(R.id.d_name)
        val loc  = findViewById<TextView>(R.id.d_loc)
        val dec = findViewById<TextView>(R.id.d_dec)

        img.setImageResource(detail!!.img)
        name.text = detail.name
        loc.text = detail.loc
        dec.text = detail.dec

        val back = findViewById<ImageView>(R.id.kembali)
        back.setOnClickListener {
            val intent = Intent(this, hlm_home::class.java)
            startActivity(intent)
           }

        }

}