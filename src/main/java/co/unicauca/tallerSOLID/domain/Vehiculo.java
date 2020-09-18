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
public abstract class Vehiculo {
    private String placa;
    
    /**
     *Metodo abstracto que seran sobre escritas por las clases hijas de la clase vehiculo
     * @return Mensajero Descripcion
     */
    public abstract String descripcion();

    
    public Vehiculo(String varPlaca) {
        this.placa = varPlaca;
    }

    /**
     * Retorna el valor de la placa
     * @return placa 
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Set para obtener la placa pasada por parametros
     * @param placa La placa con la que se identifica el vehiculo
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
    
}
