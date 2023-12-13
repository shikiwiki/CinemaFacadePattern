package com.example.cinemafacadepattern

class CinemaFacade(
    private val dvdPlayer: DvdPlayer,
    private val projector: Projector,
    private val screen: Screen,
    private val tuner: Tuner
) {
    fun watchMovie() {
        dvdPlayer.on()
        dvdPlayer.setVolume(5)
        projector.on()
        projector.wideScreenMode()
        screen.down()
        tuner.on()
    }

    fun endMovie() {
        dvdPlayer.off()
        projector.off()
        screen.up()
        tuner.off()
    }
}