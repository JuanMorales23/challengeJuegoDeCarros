package juego;

import db.Conexion;
import jugador.Jugador;
import pista.Pista;
import podio.Podio;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    ArrayList<Jugador> jugadores = new ArrayList<>();
    Jugador jugador;
    Pista pista;
    Podio podio = new Podio();
    boolean jugando = true;
    boolean bandera;
    int numJugadores = 0;
    Scanner sc = new Scanner(System.in);
    Conexion con;

    public Juego() {
        iniciarConfig();
        do{            
            iniciarJuego();
            imprimirPodio(); 
        }while(volverAJugar() == true);               
    }

    public void iniciarConfig() {
        do {
            bandera = validarJugadores();
            if (bandera == true) {
                for (int i = 0; i < numJugadores; i++) {
                    crearJugador(i);
                }
                asignarCarril(numJugadores);
            }
        } while (bandera == false);
    }

    public boolean validarJugadores() {
        System.out.print("Ingrese el número de jugadores: ");
        numJugadores = sc.nextInt();
        if (numJugadores < 3) {
            System.out.println("No se permiten menos de 3 jugadores");
            return false;
        } else {
            return true;
        }
    }

    public void crearJugador(int i) {
        System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
        String nombre = sc.next();
        jugador = new Jugador(nombre);
        jugadores.add(jugador);
    }

    public void asignarCarril(int numJugadores) {
        System.out.print("Cantidad de Kilometros que tendrá la pista: ");
        int kilometros = sc.nextInt();
        pista = new Pista(kilometros, numJugadores, jugadores);
    }

    public void iniciarJuego() {
        int turno = 1;
        while (jugando == true) {
            System.out.println("----Turno " + turno + "-----");
            for (int i = 0; i < jugadores.size(); i++) {
                turnoJugador(i);
                podioCompleto();
            }
            turno++;
        }
    }

    public void turnoJugador(int i) {
        if (pista.getCarriles().get(i).isMovimientoFinal() == false) {
            tirar(i);
            if (pista.getCarriles().get(i).isMovimientoFinal() == true) {
                asignarPuestos(i);
            } else {
                
            }
        } else {
            System.out.println("El jugador ya llegó a la meta, se omite el turno.");
        }
    }

    public void tirar(int i) {
        System.out.println("Lanza Jugador " + (i + 1));
        int valor = (jugadores.get(i).getConductor().lanzarDados()) * 100;
        System.out.println("El jugador " + (i + 1) + " avanza " + valor + " metros.");
        pista.getCarriles().get(i).moverCarro(valor);
    }

    public void asignarPuestos(int i) {
        if (podio.getPrimerPuesto() == null) {
            asignarPrimerPuesto(i);
        } else if (podio.getSegundoPuesto() == null) {
            asignarSegundoPuesto(i);
        } else if (podio.getTercerPuesto() == null) {
            asignarTercerPuesto(i);
        }
    }

    public void podioCompleto() {
        jugando = !podio.podioCompleto();
    }

    public void imprimirPodio() {
        System.out.println("1er Puesto: " + podio.getPrimerPuesto().getNombre());
        System.out.println("2do Puesto: " + podio.getSegundoPuesto().getNombre());
        System.out.println("3er Puesto: " + podio.getTercerPuesto().getNombre());
        int puntos = podio.getPrimerPuesto().getPuntos() + 1;
        podio.getPrimerPuesto().setPuntos(puntos);
        enviarDatos();        
    }
    
    public boolean volverAJugar(){
        boolean nuevoJuego = false, flag = false;
        String opc = "";
        do{
            System.out.print("Desea jugar nuevamente? (s/n): ");
            opc = sc.next();
            switch (opc){
                case "s":
                    nuevoJuego = true;
                    flag = true;
                    break;
                case "n":
                    nuevoJuego = false;
                    flag = true;
                    break;
                default:
                    System.out.println("Opción no válida.");                   
                    break;
            }            
        }while(flag == false);
        return nuevoJuego;
    }

    public void asignarPrimerPuesto(int i) {
        podio.setPrimerPuesto(jugadores.get(i));
    }

    public void asignarSegundoPuesto(int i) {
        podio.setSegundoPuesto(jugadores.get(i));
    }

    public void asignarTercerPuesto(int i) {
        podio.setTercerPuesto(jugadores.get(i));
    }

    public void enviarDatos() {
        con = new Conexion();
        con.insertarGanadores(podio);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public Podio getPodio() {
        return podio;
    }

    public void setPodio(Podio podio) {
        this.podio = podio;
    }

    public boolean isJugando() {
        return jugando;
    }

    public void setJugando(boolean jugando) {
        this.jugando = jugando;
    }
}
