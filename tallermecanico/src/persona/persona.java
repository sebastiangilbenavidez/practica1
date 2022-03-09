/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Sebastian gil
 */
public class persona {
    private String nombrecompleto;
    private int cedula;

    public persona(String nombre, int cedula){
    this.nombrecompleto = nombre;
    this.cedula = cedula;
}

    public int getCedula() {
        return cedula;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }
    
    
}
