package com.example.toplivok

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.firebase.ui.database.FirebaseListAdapter


class MainActivity : AppCompatActivity(), View.OnClickListener {

//    companion object {
//
//        private fun adapter(): FirebaseListAdapter<Refueling> {}
//        private adapter: Fire
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonAdd: Button = findViewById(R.id.buttonAdd)
        buttonAdd.setOnClickListener(this)

       // var adwa: FirebaseListAdapter
        displayAllFueling()

    }

    private fun displayAllFueling() {
        var listOfFueling: ListView = findViewById(R.id.list_of_fueling)
    }

    override fun onClick(v: View?) {
        val i: Intent
        i = Intent(this, AddActivity::class.java)
        startActivity(i)
    }
}