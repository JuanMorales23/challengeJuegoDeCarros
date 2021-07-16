package Carril;

import Carro.carro;
import Jugador.jugador;

public class carril {
    int posicion;
    int metros;
    boolean movimientoFinal;
    jugador jugador;
    carro carro;

    public carril(int posicion, int metros, boolean movimientoFinal, jugador jugador) {
        this.posicion = posicion;
        this.metros = metros;
        this.movimientoFinal = movimientoFinal;
        this.jugador = jugador;
        asignarCarro(jugador);
    }
    
    public void asignarCarro(jugador jugador){
        carro = new carro(jugador.getConductor(), 0, jugador.getColor(), 0);
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
