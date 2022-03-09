/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import persona.*;
import vehiculos.*;

/**
 *
 * @author Ganso
 */
public class Registros {
    private ArrayList<String> danios;
    private cliente cliente;
    private empleado empleado;
    private Vehiculo vehiculo;

    public Registros() {
        
    }
    
    public void registrarcliente(){
        cliente = new cliente(JOptionPane.showInputDialog("Escriba el nombre del cliente"),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula "
                        + "del cliente")),
                Integer.parseInt(JOptionPane.showInputDialog("cuando debe pagar")));
   
    }
    public cliente cliente(){
        return cliente;
    }
    public void registrarempleado(){
        empleado = new empleado(JOptionPane.showInputDialog("Escriba el nombre del empleado"),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula "
                        + "del empleado"))
                );
        
    }
    public empleado empleado(){
        return empleado;
    }
    public void listadodanios(){
        
    }
    private void registrarcarro(){
        vehiculo = new carro(
            JOptionPane.showInputDialog("Escriba la matricula del carro"),
            JOptionPane.showInputDialog("Escriba la marca del carro"),
            Integer.parseInt(JOptionPane.showInputDialog("Escriba el anio de la carro")),
            JOptionPane.showInputDialog("Escriba el tipo de traccion del carro ")
        );
      
    }
    public Vehiculo mostrarvehiculo(){
        return vehiculo;
    }
    private void registrarmoto(){
        vehiculo = new moto(
            JOptionPane.showInputDialog("Escriba la matricula de la moto"),
            JOptionPane.showInputDialog("Escriba la marca de la moto"),
            Integer.parseInt(JOptionPane.showInputDialog("Escriba el anio de la moto")),
            JOptionPane.showInputDialog("Escriba el cilindrada de la moto")
        );
      
    }
    
    public void tipovehiculo() {
        if(Integer.parseInt(JOptionPane.showInputDialog("marque el numero correspondiente al vehiculo: \n 1. moto \n 2. carro")) == 1){
           registrarmoto();
        }else{
           registrarcarro();
        }
    }
    public void registrardanios(){
        int cantidaddanios = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de daños del vehiculo"));
        for (int i = 0; i < cantidaddanios; i++) {
            danios.set(i, JOptionPane.showInputDialog("Describa el danio"));
        }
    }
    @Override
    public String toString() {
        String informacion = " cliente: "+ cliente.getNombrecompleto()+"\n empleado: "+ empleado.getNombrecompleto() 
                + " \n vehiculo: " + vehiculo.getMatriculaVehiculo();
        informacion+= "\n danios registrados";
        for (String danio : danios) {
            informacion+= "\n"+danio;
        }
        if(moto.class.isInstance(vehiculo)){
            informacion += "\n tipo vehiculo moto";
        }else{
            informacion += "\n tipo vehiculo carro";
        }
        return informacion;
    }
    
    
    
}
