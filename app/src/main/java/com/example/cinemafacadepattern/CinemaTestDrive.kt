package com.example.cinemafacadepattern

fun main() {
    val dvdPlayer = DvdPlayer()
    val projector = Projector()
    val screen = Screen()
    val tuner = Tuner()

    val cinemaFacade = CinemaFacade(dvdPlayer, projector, screen, tuner)

    cinemaFacade.watchMovie()
    cinemaFacade.endMovie()
}