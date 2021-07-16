
package challenge.juego.de.carros;

import db.conexion;

/**
 *
 * @author Juan Esteban Morales Ríos
 * CC: 1026158485
 */
public class ChallengeJuegoDeCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        db.conexion con = new conexion();
        //con.create();
        con.read();
        //con.update();
        con.delete();               
    }
    
}
