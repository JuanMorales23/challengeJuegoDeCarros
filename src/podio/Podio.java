package podio;

import jugador.Jugador;

public class Podio {
    private Jugador PrimerPuesto;
    private Jugador SegundoPuesto;    
    private Jugador TercerPuesto;

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

    public void reiniciarPodio(){
        PrimerPuesto = null;
        SegundoPuesto = null;
        TercerPuesto = null;
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
