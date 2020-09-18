/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerSOLID.main;

import co.unicauca.tallerSOLID.domain.*;
import co.unicauca.tallerSOLID.parqueadero.parqueadero;

/**
 *
 * @author Andrescd,Josedd
 */
public class main {

    public static void main(String[] args) throws InterruptedException {
        /**
         * Creacion del parqueadero
         * @param parqueadero Inicializacion del parqueadero
         */

        parqueadero p = new parqueadero(50);
       
         
         //Camion

        p.ingresarAuto(new Camion("eee-666"));
        p.buscarPlaca("eee-666");
        p.salidaAuto("eee-666");
        
        //Moto
        
        p.ingresarAuto(new Moto("abc-123"));
        p.buscarPlaca("abc-123");
        p.salidaAuto("abc-123");
        
        
        //carro 
        
        
        p.ingresarAuto(new Carro("qwe-852"));
        p.buscarPlaca("qwe-852");
        p.salidaAuto("qwe-852");
       
         /*  p.facturar(1500, "Camion");
           p.facturar(300, "Camion");
        p.facturar(120, "Carro");
        
        p.facturar(127, "Carro");
        p.facturar(56, "Carro");
         
        p.facturar(121, "Moto");
          p.facturar(30, "Moto");*/

    }

}
