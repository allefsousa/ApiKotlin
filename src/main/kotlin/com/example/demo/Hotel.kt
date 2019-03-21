package com.example.demo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Hotel(val name:String,val end:String, val classification: Int, val nbRooms: Int) {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Long = 0
    var nbFreeRooms: Int = this.nbRooms


    constructor():this("","",0,0)

    fun checkIn(nbGuest:Int){
        if (this.nbFreeRooms >= nbGuest ){
            this.nbFreeRooms -= nbGuest
        }


    }

    fun checkOut(nbGuest:Int){
        this.nbFreeRooms += nbGuest

    }

}