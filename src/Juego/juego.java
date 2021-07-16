package Juego;

public class juego {
    int IdJuego;
    int IdJugadores;
    int IdPista; 
    int idPodio;

    public juego(int IdJuego, int IdJugadores, int IdPista, int idPodio) {
        this.IdJuego = IdJuego;
        this.IdJugadores = IdJugadores;
        this.IdPista = IdPista;
        this.idPodio = idPodio;
    }

    public int getIdJuego() {
        return IdJuego;
    }

    public void setIdJuego(int IdJuego) {
        this.IdJuego = IdJuego;
    }

    public int getIdJugadores() {
        return IdJugadores;
    }

    public void setIdJugadores(int IdJugadores) {
        this.IdJugadores = IdJugadores;
    }

    public int getIdPista() {
        return IdPista;
    }

    public void setIdPista(int IdPista) {
        this.IdPista = IdPista;
    }

    public int getIdPodio() {
        return idPodio;
    }

    public void setIdPodio(int idPodio) {
        this.idPodio = idPodio;
    }
    
}
