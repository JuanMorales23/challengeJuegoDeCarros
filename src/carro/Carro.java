package carro;

import conductor.Conductor;

public class Carro {
    Conductor conductor;
    int distaciaRecorrida;

    public Carro(Conductor conductor) {
        this.conductor = conductor;
        this.distaciaRecorrida = 0;
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
}
