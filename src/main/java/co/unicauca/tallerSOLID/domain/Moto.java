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
public class Moto extends Vehiculo {

      /**
     * Metodo para obtener de la moto heredado de la clase vehiculo
     * @param varPlaca La placa con la que se identifica la moto 
     */
    public Moto(String varPlaca) {
        super(varPlaca);
    }

    /**
     * Descripcion para la moto
     * @return Mensaje
     */
    @Override
    public String descripcion() {
         return "El vehiculo es de tipo Moto";
    }

  
    
}
