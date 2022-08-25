package com.example.KickOns

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_player.*
import kotlinx.android.synthetic.main.card_creation.*
import kotlinx.android.synthetic.main.welcome_page.*

class AddPlayer : AppCompatActivity() {

    private var startGame: MainActivity? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_player)

        btnStartFromChoosePlayers.setOnClickListener{
            val intent = Intent(this, DeckPicker()::class.java)
            startActivity(intent)
        }


    }

}