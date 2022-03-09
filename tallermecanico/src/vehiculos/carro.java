/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Sebastian gil
 */
public class carro extends Vehiculo{
    
    private String traccion;

    public carro(String MatriculaVehiculo, String marcaVehiculo, int anioVehiculo, String traccion) {
        super(MatriculaVehiculo, marcaVehiculo, anioVehiculo);
        this.traccion = traccion;
    }
 
}
