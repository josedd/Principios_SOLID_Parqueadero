/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerSOLID.parqueadero;

import co.unicauca.tallerSOLID.domain.*;
import java.time.*;
import java.util.Random;

/**
 *
 * @author Andrescd,Josedd
 */
public class parqueadero {

    private plaza[] atrParqueadero;

    /**
     *
     * @param varPlazas
     */
    public parqueadero(int varPlazas) {
        atrParqueadero = new plaza[varPlazas];
        for (int i = 0; i < varPlazas; i++) {
            atrParqueadero[i] = new plaza();
        }
    }

    
    public static int getRandomInteger(int máximo, int mínimo) {
        return ((int) (Math.random() * (máximo - mínimo))) + mínimo;
    }
    
    /**
     *
     * @param minutos
     * @param varTipoVehiculo
     */
 
    public void facturar(long minutos, String varTipoVehiculo) {
         Factura caja = new Factura();
         caja.facturar(minutos, varTipoVehiculo);
    }
      

    /**
     *
     * @param varAuto
     * @return
     */
    public boolean ingresarAuto(Vehiculo varAuto) {
        try {
            for (plaza varParqueadero : atrParqueadero) {
                if (!(varParqueadero.isOcupado())) {
                    varParqueadero.setAtrVehiculo(varAuto);
                    varParqueadero.setTiempoIngreso((LocalTime.now().getHour() * 60) + LocalTime.now().getMinute());
                    varParqueadero.setOcupado(true);
                    return true;
                } else {
                    System.err.println("No hay sitio disponible");
                    return false;
                }
            }
            return false;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    /**
     *
     * @param varPlaca
     * @return
     */
    public boolean salidaAuto(String varPlaca) {
        try {
            for (plaza varPlaza : atrParqueadero) {
                if (varPlaza.getAtrVehiculo() != null) {
                    if (varPlaza.getAtrVehiculo().getPlaca().equals(varPlaca)) {
                        varPlaza.setTiempoSalida((LocalTime.now().getHour() * 60) + LocalTime.now().getMinute());
                        facturar(varPlaza.getTiempo(), varPlaza.getAtrVehiculo().getClass().getSimpleName());
                        varPlaza.setAtrVehiculo(null);
                        varPlaza.setOcupado(false);
                    } else {
                        System.err.println("No se encontro el vehiculo");
                    }
                }
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;

        }
    }

    /**
     *
     * @return
     */
    public plaza[] getAtrParqueadero() {
        return atrParqueadero;
    }

    /**
     *
     * @param varPlaca
     * @return
     */
    public boolean buscarPlaca(String varPlaca) {
        for (plaza varPlaza : atrParqueadero) {
            if (varPlaza.isOcupado()) {
                if (varPlaza.getAtrVehiculo().getPlaca().equals(varPlaca)) {
                    return true;
                }
            }
        }
        System.err.println("No se encontro el vehiculo");
        return false;

    }
}
