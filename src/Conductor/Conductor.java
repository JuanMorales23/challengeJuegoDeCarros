package Conductor;

public class Conductor {
    String nombre;
    //carro carro;
    
    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public int lanzarDados(){        
        return (int) (Math.random() * 5 + 1);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

