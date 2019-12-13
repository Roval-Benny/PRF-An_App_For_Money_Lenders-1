package com.prf.prf

class Global2 {


    companion object Chosen{
        var globalList:ArrayList<Users>? = null
        
        fun returnGlobals(): ArrayList<Users> {

            return globalList!!

        }
    }
}
