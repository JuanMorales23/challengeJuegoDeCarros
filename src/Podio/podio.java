package Podio;

import Jugador.jugador;

public class podio {
    jugador PrimerPuesto;
    jugador SegundoPuesto;    
    jugador TercerPuesto;

    public podio(jugador PrimerPuesto, jugador SegundoPuesto, jugador TercerPuesto) {
        this.PrimerPuesto = PrimerPuesto;
        this.SegundoPuesto = SegundoPuesto;
        this.TercerPuesto = TercerPuesto;
    }

    public jugador getPrimerPuesto() {
        return PrimerPuesto;
    }

    public void setPrimerPuesto(jugador PrimerPuesto) {
        this.PrimerPuesto = PrimerPuesto;
    }

    public jugador getSegundoPuesto() {
        return SegundoPuesto;
    }

    public void setSegundoPuesto(jugador SegundoPuesto) {
        this.SegundoPuesto = SegundoPuesto;
    }

    public jugador getTercerPuesto() {
        return TercerPuesto;
    }

    public void setTercerPuesto(jugador TercerPuesto) {
        this.TercerPuesto = TercerPuesto;
    }
}
