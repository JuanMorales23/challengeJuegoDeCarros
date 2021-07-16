package Jugador;

import Conductor.conductor;

public class jugador {
    String nombre;
    String color;
    int puntos;
    conductor conductor;

    public jugador(String nombre, String color, int puntos) {
        this.nombre = nombre;
        this.color = color;
        this.puntos = puntos;
        conductor = new conductor(nombre);
    }

    public conductor getConductor() {
        return conductor;
    }

    public void setConductor(conductor conductor) {
        this.conductor = conductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}
