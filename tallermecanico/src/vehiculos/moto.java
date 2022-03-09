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
public class moto extends Vehiculo {

    private String cilindrada;

    public moto(String MatriculaVehiculo, String marcaVehiculo, int anioVehiculo, String cilindrada) {
        super(MatriculaVehiculo, marcaVehiculo, anioVehiculo);
        this.cilindrada = cilindrada;
    }

}
