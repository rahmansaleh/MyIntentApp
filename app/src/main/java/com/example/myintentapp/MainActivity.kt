package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val moveIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Rahman")
                moveIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 22)
                startActivity(moveIntent)
            }

            R.id.btn_dial_number -> {
                val phoneNumber = "085781129984"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        val btnMoveActivityWithData: Button = findViewById(R.id.btn_move_activity_data)
        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)

        btnMoveActivity.setOnClickListener(this)
        btnMoveActivityWithData.setOnClickListener(this)
        btnDialPhone.setOnClickListener(this)
    }
}
