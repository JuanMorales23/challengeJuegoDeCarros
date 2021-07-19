package conductor;

public class Conductor {
    private String nombre;
    
    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public int lanzarDados(){        
        return (int) (Math.random() * 6 + 1);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

