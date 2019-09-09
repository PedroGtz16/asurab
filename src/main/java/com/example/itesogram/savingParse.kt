package com.example.itesogram

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.picker.MaterialTextInputPicker
import com.google.android.material.textfield.TextInputEditText
import com.parse.ParseObject
import com.parse.ParseQuery
import kotlinx.android.synthetic.main.activity_savingparse.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity

class savingParse : AppCompatActivity() {

    private lateinit var textToGet : TextView
    private lateinit var textToSend: TextInputEditText
    private lateinit var sendParse: MaterialButton
    private lateinit var getParse: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sendParse = find(R.id.buttonSendParse)
        getParse = find(R.id.buttonGetParse)
        textToSend=find(R.id.parseSend)
        textToGet = find(R.id.mensajeParse)

    //GET PARSE
        getParse.setOnClickListener {

            doAsync {
                val query = ParseQuery<ParseObject>("Tarea")
                query.whereEqualTo("expedientes", "is703761")
                query.addDescendingOrder("createdAt")
                query.getFirstInBackground{obj, e->
                    if(e==null)
                        mensajeParse.text = obj["valor"] as String
                    else
                        error{e}

                }
            }

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