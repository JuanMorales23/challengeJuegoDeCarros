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
        iniciarConfig();
    }

    public void iniciarConfig() {
        System.out.print("Ingrese el número de jugadores: ");
        numJugadores = sc.nextInt();
        for (int i = 0; i < numJugadores; i++) {
            crearJugador(i);
        }
        asignarCarril(numJugadores);
    }

    public void crearJugador(int i) {
        //System.out.println("Ingrese el nombre del jugador: ");
        //String nombre = sc.next();
        System.out.print("Ingrese el color: ");
        String color = sc.next();
        jugador = new jugador("jugador " + (i + 1), color, 0);
        jugadores.add(jugador);
    }

    public void asignarCarril(int numJugadores) {
        System.out.print("Cantidad de Kilometros que tendrá la pista: ");
        int kilometros = sc.nextInt();
        pista = new pista(kilometros, numJugadores, jugadores);
    }

    public void iniciarJuego() {
        boolean fin = false;
        do {
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println("Lanza Jugador " + (i + 1));
                int valor = (jugadores.get(i).getConductor().lanzarDados())*100;
                System.out.println("El jugador sacó " + valor + "puntos.");
            }
        } while (fin == true);
    }

    public void asignarPrimerPuesto() {
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
