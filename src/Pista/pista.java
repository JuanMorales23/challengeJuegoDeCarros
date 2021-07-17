package Pista;

import Carril.Carril;
import Carro.Carro;
import Jugador.jugador;
import java.util.ArrayList;

public class pista {
    int kilometros;
    int numCarriles;
    ArrayList<Carril> carriles = new ArrayList<>();
    ArrayList<jugador> jugadores = new ArrayList<>();
    Carril carril;
    
    public pista(int kilometros, int numCarriles, ArrayList<jugador> jugadores) {
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
