package carro;

import conductor.Conductor;

public class Carro {
    Conductor conductor;
    int distaciaRecorrida;
    String Color;

    public Carro(Conductor conductor, String Color) {
        this.conductor = conductor;
        this.distaciaRecorrida = 0;
        this.Color = Color;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public int getDistaciaRecorrida() {
        return distaciaRecorrida;
    }

    public void setDistaciaRecorrida(int distaciaRecorrida) {
        this.distaciaRecorrida = distaciaRecorrida;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }  
}
