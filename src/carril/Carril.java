package carril;

import carro.Carro;
import jugador.Jugador;

public class Carril {
    int posicion;
    int metrosTotales;
    boolean movimientoFinal;
    Jugador jugador;
    Carro carro;

    public Carril(int metrosTotales, Jugador jugador) {
        this.posicion = 0;
        this.metrosTotales = metrosTotales;
        this.movimientoFinal = false;
        this.jugador = jugador;
        asignarCarro(jugador);
    }
    
    public void asignarCarro(Jugador jugador){
        carro = new Carro(jugador.getConductor(), jugador.getColor());
    }
    
    public void moverCarro(int movimientos){
        posicion = posicion + movimientos;
        carro.setDistaciaRecorrida(posicion);
        cruzoMeta();
    }
    
    public void cruzoMeta(){
        if(posicion < metrosTotales){
            movimientoFinal = false;
        }else{
            movimientoFinal = true;
        }        
    }
    
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getMetrosTotales() {
        return metrosTotales;
    }

    public void setMetrosTotales(int metros) {
        this.metrosTotales = metros;
    }

    public boolean isMovimientoFinal() {
        return movimientoFinal;
    }

    public void setMovimientoFinal(boolean movimientoFinal) {
        this.movimientoFinal = movimientoFinal;
    }
    
}
