package Carril;

import Carro.Carro;
import Jugador.jugador;

public class Carril {
    int posicion;
    int metros;
    boolean movimientoFinal;
    jugador jugador;
    Carro carro;

    public Carril(int metros, jugador jugador) {
        this.posicion = 0;
        this.metros = metros;
        this.movimientoFinal = false;
        this.jugador = jugador;
        asignarCarro(jugador);
    }
    
    public void asignarCarro(jugador jugador){
        carro = new Carro(jugador.getConductor(), 0, jugador.getColor(), 0);
    }
    
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public boolean isMovimientoFinal() {
        return movimientoFinal;
    }

    public void setMovimientoFinal(boolean movimientoFinal) {
        this.movimientoFinal = movimientoFinal;
    }
    
}
