package com.example.itesogram

import android.app.Application
import android.service.autofill.FillEventHistory
import com.parse.Parse

class itesogram (): Application(){

    override fun onCreate(){
        super.onCreate()
        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId("v1kx8QckHwFoOhVF6JqOIkY77Y3ancPhksQnt4k6")
                .clientKey("fVER38fcRHHMHtrS10xq8BnTAsQdrDKvoXSR3maP")
                .server("https://parseapi.back4app.com/")
                .build()
        )
    }
}




