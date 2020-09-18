/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerSOLID.domain;

/**
 *
 * @author Andrescd,Josedd
 */
public class Camion extends Vehiculo {

     /**
     * Metodo para obtener del camion heredado de la clase vehiculo
     * @param varPlaca La placa con la que se identifica el camion
     */
    public Camion(String varPlaca) {
        super(varPlaca);
    }

    /**
     * Descripcion para el camion
     * @return Mensaje
     */
    @Override
    public String descripcion() {
         return "El vehiculo es de tipo Camion";
    }

  
    
}
