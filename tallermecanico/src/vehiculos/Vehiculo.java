/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Ganso
 */
public class Vehiculo {
    private String matriculaVehiculo;
    private String marcaVehiculo;
    private int anioVehiculo;

    public Vehiculo(String MatriculaVehiculo, String marcaVehiculo, int anioVehiculo){
        this.matriculaVehiculo = MatriculaVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.anioVehiculo = anioVehiculo;
    }
    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public String getMatriculaVehiculo() {
        return matriculaVehiculo;
    }
    
}
