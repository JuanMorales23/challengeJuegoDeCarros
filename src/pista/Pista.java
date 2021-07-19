package pista;

import carril.Carril;
import carro.Carro;
import jugador.Jugador;
import java.util.ArrayList;

public class Pista {
    private int kilometros;
    private int numCarriles;
    private ArrayList<Carril> carriles = new ArrayList<>();
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Carril carril;
    
    public Pista(int kilometros, int numCarriles, ArrayList<Jugador> jugadores) {
        this.kilometros = kilometros;
        this.numCarriles = numCarriles;        
        this.jugadores = jugadores;
        crearCarriles();
    }
    
    public void crearCarriles(){
        for (int i = 0; i < numCarriles; i++) {
            carril = new Carril((kilometros*1000), jugadores.get(i));            
            carriles.add(carril);
        }
    }
    
    public void reiniciarPosiciones(){
        for (int i = 0; i < carriles.size(); i++) {
            carriles.get(i).setPosicion(0);
            carriles.get(i).reiniciarPosicionCarro();
            carriles.get(i).setMovimientoFinal(false);
        }
    }

    public ArrayList<Carril> getCarriles() {
        return carriles;
    }

    public void setCarriles(ArrayList<Carril> carriles) {
        this.carriles = carriles;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getNumCarriles() {
        return numCarriles;
    }

    public void setNumCarriles(int numCarriles) {
        this.numCarriles = numCarriles;
    }
}
