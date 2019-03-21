package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component


@Component
class DbSeeder(val hotelRepository: HotelRepository) :CommandLineRunner {
    override fun run(vararg args: String?) {
        this.hotelRepository.deleteAll()

        val ibis = Hotel( "Ibis","Avenida presidente Vargas",4,30)
        val inter = Hotel( "Intercontineltal","Avenida presidente Vargas",5,130)
        val jr = Hotel( "JR","Avenida presidente Vargas",7,200)

        val hotels = mutableListOf<Hotel>()

        hotels.add(ibis)
        hotels.add(inter)
        hotels.add(jr)

        this.hotelRepository.saveAll(hotels)
        print("--- DataBase Inicializada")


    }
}