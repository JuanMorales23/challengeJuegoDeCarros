package podio;

import jugador.Jugador;

public class Podio {
    Jugador PrimerPuesto;
    Jugador SegundoPuesto;    
    Jugador TercerPuesto;

    public Podio() {
        this.PrimerPuesto = null;
        this.SegundoPuesto = null;
        this.TercerPuesto = null;
    }

    public boolean podioCompleto(){
        if(PrimerPuesto != null && SegundoPuesto != null && TercerPuesto != null){
            return true;
        }else{
            return false;
        }
    }
    
    public Jugador getPrimerPuesto() {
        return PrimerPuesto;
    }

    public void setPrimerPuesto(Jugador PrimerPuesto) {
        this.PrimerPuesto = PrimerPuesto;
    }

    public Jugador getSegundoPuesto() {
        return SegundoPuesto;
    }

    public void setSegundoPuesto(Jugador SegundoPuesto) {
        this.SegundoPuesto = SegundoPuesto;
    }

    public Jugador getTercerPuesto() {
        return TercerPuesto;
    }

    public void setTercerPuesto(Jugador TercerPuesto) {
        this.TercerPuesto = TercerPuesto;
    }
}
