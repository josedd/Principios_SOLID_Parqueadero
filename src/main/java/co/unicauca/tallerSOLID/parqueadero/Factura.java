/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerSOLID.parqueadero;

/**
 *
 * @author USUARIO
 */
public class Factura {
     public static int getRandomInteger(int máximo, int mínimo) {
        return ((int) (Math.random() * (máximo - mínimo))) + mínimo;
    }
    
    /**
     *
     * @param minutos minutos trascurridos en el parqueadero
     * @param varTipoVehiculo
     */
    
    public void facturar(long minutos, String varTipoVehiculo) {
        long result = 0;
        long v_mod = 0;
        long fraccion = 0;
        long sum = 0;
        

        if (varTipoVehiculo.equals("Camion")) {
           int rd =getRandomInteger(100, 10000);
            if (minutos >= 0 && minutos <= 720) {
                result = 10000;

            } else if (minutos > 720 && minutos <= 1440) {
                result = 15000;
            } else if (minutos > 1440) {
                v_mod = minutos % 1440;
                result = result + ((minutos - v_mod) / 1440) * 15000 + (15000 / v_mod);

            }
            if (result % 100 != 0) {
                sum = 100 - result % 100;
                result = result + sum;
            }
            
            if (rd==10) {
                result=0;
            }
        }
        if (varTipoVehiculo.equals("Carro")) {
            if (minutos < 60) {
                result = 2000;
            } else {
                v_mod = minutos % 60;

                if (v_mod > 0 && v_mod <= 15) {
                    fraccion = 250;
                }
                if (v_mod > 15 && v_mod <= 30) {
                    fraccion = 500;
                }
                if (v_mod > 30 && v_mod <= 45) {
                    fraccion = 750;
                }
                if (v_mod > 45 && v_mod < 60) {
                    fraccion = 1000;
                }

                result = result + ((minutos - v_mod) / 60) * 1000 + fraccion;

                if (result % 100 != 0) {
                    sum = 100 - result % 100;
                    result = result + sum;
                }

            }
        }
        if (varTipoVehiculo.equals("Moto")) {

            if (minutos < 60) {
                result = 1000;
            } else {
                v_mod = minutos % 60;

                if (v_mod > 0 && v_mod <= 15) {
                    fraccion = 125;
                }
                if (v_mod > 15 && v_mod <= 30) {
                    fraccion = 250;
                }
                if (v_mod > 30 && v_mod <= 45) {
                    fraccion = 375;
                }
                if (v_mod > 45 && v_mod < 60) {
                    fraccion = 500;
                }

                result = result + ((minutos - v_mod) / 60) * 1000 + fraccion;

                if (result % 100 != 0) {
                    sum = 100 - result % 100;
                    result = result + sum;
                }

            }

        }

        System.out.println(result);
    }
}
