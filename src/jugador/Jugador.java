package jugador;

import conductor.Conductor;

public class Jugador {
    String nombre;
    String color;
    int puntos;
    Conductor conductor;

    public Jugador(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.puntos = 0;
        conductor = new Conductor(nombre);
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
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
