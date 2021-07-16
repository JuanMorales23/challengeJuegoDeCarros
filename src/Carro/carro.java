package Carro;

import Conductor.conductor;

public class carro {
    conductor conductor;
    int distaciaRecorrida;
    String Color;

    public carro(conductor conductor, int distaciaRecorrida, String Color, int posicion) {
        this.conductor = conductor;
        this.distaciaRecorrida = distaciaRecorrida;
        this.Color = Color;
    }

    public conductor getConductor() {
        return conductor;
    }

    public void setConductor(conductor conductor) {
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
