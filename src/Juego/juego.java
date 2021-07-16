package Juego;

import Jugador.jugador;
import Pista.pista;
import Podio.podio;
import java.util.ArrayList;

public class juego {
    ArrayList<jugador> jugadores;
    pista pista;
    podio podio;
    boolean jugando;

    public juego(ArrayList<jugador> jugadores, pista pista, podio podio, boolean jugando) {
        this.jugadores = jugadores;
        this.pista = pista;
        this.podio = podio;
        this.jugando = jugando;
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public pista getPista() {
        return pista;
    }

    public void setPista(pista pista) {
        this.pista = pista;
    }

    public podio getPodio() {
        return podio;
    }

    public void setPodio(podio podio) {
        this.podio = podio;
    }

    public boolean isJugando() {
        return jugando;
    }

    public void setJugando(boolean jugando) {
        this.jugando = jugando;
    }
}
