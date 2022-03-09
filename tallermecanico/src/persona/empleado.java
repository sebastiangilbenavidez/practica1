/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Ganso
 */
public class empleado extends persona{
    private String cargo="empleado";
    private int vehiculosarreglados;
    
    public empleado(String nombre, int cedula){
        super(nombre, cedula);
        this.vehiculosarreglados = this.vehiculosarreglados+1;
    }
    
    
}
