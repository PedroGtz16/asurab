package com.example.itesogram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.picker.MaterialTextInputPicker
import com.google.android.material.textfield.TextInputEditText
import com.parse.ParseObject
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity

class savingParse : AppCompatActivity() {

    private lateinit var textToSend: TextInputEditText
    private lateinit var sendParse: MaterialButton
    private lateinit var getParse: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sendParse = find(R.id.buttonSendParse)
        getParse = find(R.id.buttonGetParse)
        textToSend=find(R.id.parseSend)

    //GET PARSE
        getParse.setOnClickListener {

        




        }
        //SEND PARSE
        sendParse.setOnClickListener{
            val value = textToSend.toString()
            val studentObject = ParseObject("Tarea")
            studentObject.put("expediente","is703761")
            studentObject.put("valor",value)
            studentObject.saveInBackground()
        }






    }







}