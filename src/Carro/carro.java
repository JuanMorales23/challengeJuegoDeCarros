package Carro;

public class carro {

    int idCarro;
    int idConductor;
    int idPosicion;
    int idDistancia;
    int idJuego;

    public carro(int idCarro, int idConductor, int idPosicion, int idDistancia, int idJuego) {
        this.idCarro = idCarro;
        this.idConductor = idConductor;
        this.idPosicion = idPosicion;
        this.idDistancia = idDistancia;
        this.idJuego = idJuego;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public int getIdPosicion() {
        return idPosicion;
    }

    public void setIdPosicion(int idPosicion) {
        this.idPosicion = idPosicion;
    }

    public int getIdDistancia() {
        return idDistancia;
    }

    public void setIdDistancia(int idDistancia) {
        this.idDistancia = idDistancia;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }
    
    
}
