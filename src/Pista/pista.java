package Pista;

import Carril.carril;
import Carro.carro;
import Jugador.jugador;
import java.util.ArrayList;

public class pista {
    int kilometros;
    int numCarriles;
    ArrayList<carril> carriles = new ArrayList<>();
    ArrayList<jugador> jugadores = new ArrayList<>();
    carril carril;
    
    public pista(int kilometros, int numCarriles, ArrayList<jugador> jugadores) {
        this.kilometros = kilometros;
        this.numCarriles = numCarriles;        
        this.jugadores = jugadores;
        crearCarriles();
    }
    
    public void crearCarriles(){
        for (int i = 0; i < numCarriles; i++) {
            carril = new carril(0, (kilometros*1000), false, jugadores.get(i));            
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
