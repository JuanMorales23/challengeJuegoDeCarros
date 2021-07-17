package Juego;

import Jugador.jugador;
import Pista.pista;
import Podio.podio;
import java.util.ArrayList;
import java.util.Scanner;

public class juego {
    ArrayList<jugador> jugadores = new ArrayList<>();
    jugador jugador;
    pista pista;
    podio podio;
    boolean jugando;
    int numJugadores = 0;
    Scanner sc = new Scanner(System.in);

    public juego() {
        mostrarMenu();
    }
    
    public void mostrarMenu(){        
        System.out.print("Ingrese el número de jugadores: ");
        numJugadores = sc.nextInt();
        for (int i = 0; i < numJugadores; i++) {
            crearJugador(i);            
        }
        asignarCarril(numJugadores);
    }
    
    public void crearJugador(int i){
        System.out.print("Ingrese el color: ");
        String color = sc.next();
        jugador = new jugador("jugador " + (i+1), color, 0);
        jugadores.add(jugador);
    }
    
    public void asignarCarril(int numJugadores){
        System.out.print("Cantidad de Kilometros que tendrá la pista: ");
        int kilometros = sc.nextInt();
        pista = new pista(kilometros, numJugadores, jugadores);        
    }
    
    public void asignarPrimerPuesto(){
        podio.setPrimerPuesto(jugador);
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
