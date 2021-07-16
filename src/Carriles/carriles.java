package Carriles;

public class carriles {
    int posicion;
    int metros;
    boolean movimientoFinal;

    public carriles(int posicion, int metros, boolean movimientoFinal) {
        this.posicion = posicion;
        this.metros = metros;
        this.movimientoFinal = movimientoFinal;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public boolean isMovimientoFinal() {
        return movimientoFinal;
    }

    public void setMovimientoFinal(boolean movimientoFinal) {
        this.movimientoFinal = movimientoFinal;
    }
    
}
