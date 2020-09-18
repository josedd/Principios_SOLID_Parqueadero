/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerSOLID.parqueadero;

import co.unicauca.tallerSOLID.domain.*;

/**
 *
 * @author Andrescd,Josedd
 */
class plaza {

    /**
     * @param ocupado parametro para conocer si la plaza esta ocupada o libre
     * @param vehiculo Vehiculo que se encunetra en la plaza
     * @param tiempoIngreso Tiempo de ingreso del vehiculo al parqueadero
     * @param tiempoSalida Tiempo de salida del vehiculo al parqueadero
     */
    private boolean ocupado = false;
    private Vehiculo atrVehiculo;
    private long tiempoIngreso;
    private long tiempoSalida;

    /*
     * Metodo para obtener el vehiculo de la plaza
     * @return Vehiculo
     */
    public Vehiculo getAtrVehiculo() {
        return atrVehiculo;

    }

    public long getTiempo() {
        return tiempoSalida - tiempoIngreso;
    }

    public void setAtrVehiculo(Vehiculo atrVehiculo) {
        this.atrVehiculo = atrVehiculo;
    }

    public void setTiempoIngreso(long tiempoIngreso) {
        this.tiempoIngreso = tiempoIngreso;
    }

    public void setTiempoSalida(long tiempoSalida) {
        this.tiempoSalida = tiempoSalida;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return ocupado;
    }
}
