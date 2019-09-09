package com.example.itesogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity

class MainActivity :AppCompatActivity(),AnkoLogger {

        private lateinit var mNewActivityButton: MaterialButton

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

           // mText = find(R.id.activity_savingparse) // findViewById using anko
            mNewActivityButton = find(R.id.button) // findViewById using anko
            //mNewActivityButton = find(R.id.activity_main_btn_new_activity) // findViewById using anko

            mNewActivityButton.setOnClickListener {
                startActivity<savingParse>()
            }

        }
}
