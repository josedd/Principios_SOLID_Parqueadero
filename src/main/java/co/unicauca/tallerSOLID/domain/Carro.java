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
public class Carro extends Vehiculo {

     /**
     * Metodo para obtener del carro heredado de la clase vehiculo
     * @param varPlaca La placa con la que se identifica el carro 
     */
    public Carro(String varPlaca) {
        super(varPlaca);
    }

    /**
     * Descripcion para el carro
     * @return Mensaje
     */
    @Override
    public String descripcion() {
         return "El vehiculo es de tipo Carro";
    }

  
    
}
