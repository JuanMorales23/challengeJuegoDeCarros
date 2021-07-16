package Pista;

public class pista {
    int idPista;
    int kilometros;
    int numCarriles;

    public pista(int idPista, int kilometros, int numCarriles) {
        this.idPista = idPista;
        this.kilometros = kilometros;
        this.numCarriles = numCarriles;
    }

    public int getIdPista() {
        return idPista;
    }

    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getNumCarriles() {
        return numCarriles;
    }

    public void setNumCarriles(int numCarriles) {
        this.numCarriles = numCarriles;
    }
    
    
}
