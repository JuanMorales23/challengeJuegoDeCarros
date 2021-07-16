package Podio;

public class podio {
    int idPodio;
    int idPrimerPuesto;
    int idSegundoPuesto;    
    int idTercerPuesto;
    
    public podio(int idPodio, int idPrimerPuesto, int idSegundoPuesto, int idTercerPuesto) {
        this.idPodio = idPodio;
        this.idPrimerPuesto = idPrimerPuesto;
        this.idSegundoPuesto = idSegundoPuesto;
        this.idTercerPuesto = idTercerPuesto;
    }

    public int getIdPodio() {
        return idPodio;
    }

    public void setIdPodio(int idPodio) {
        this.idPodio = idPodio;
    }

    public int getIdPrimerPuesto() {
        return idPrimerPuesto;
    }

    public void setIdPrimerPuesto(int idPrimerPuesto) {
        this.idPrimerPuesto = idPrimerPuesto;
    }

    public int getIdSegundoPuesto() {
        return idSegundoPuesto;
    }

    public void setIdSegundoPuesto(int idSegundoPuesto) {
        this.idSegundoPuesto = idSegundoPuesto;
    }

    public int getIdTercerPuesto() {
        return idTercerPuesto;
    }

    public void setIdTercerPuesto(int idTercerPuesto) {
        this.idTercerPuesto = idTercerPuesto;
    }
}
