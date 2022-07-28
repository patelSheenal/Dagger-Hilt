package com.example.dagger_hilt

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email:String, password: String){
        Log.d("Email", "Save user details ")
    }
}