package Pista;

public class pista {
    int kilometros;
    int numCarriles;

    public pista(int kilometros, int numCarriles) {
        this.kilometros = kilometros;
        this.numCarriles = numCarriles;
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
