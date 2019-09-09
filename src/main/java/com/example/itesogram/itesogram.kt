package com.example.itesogram

import android.app.Application
import android.service.autofill.FillEventHistory
import com.parse.Parse

class itesogram (): Application(){

    override fun onCreate() {
        super.onCreate()
        Parse.initialize(
            Parse.Configuration.Builder(this).applicationId()
            .clientKey()
            .server()
            .build()




        )
    }



}