package jugador;

import conductor.Conductor;

public class Jugador {
    private String nombre;
    private int ganadas;
    private Conductor conductor;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.ganadas = 0;
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

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }


}
