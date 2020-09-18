/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import co.unicauca.tallerSOLID.domain.Camion;
import co.unicauca.tallerSOLID.domain.Moto;
import co.unicauca.tallerSOLID.domain.Carro;
import co.unicauca.tallerSOLID.domain.Vehiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Test;
import static org.junit.Assert.*;
import co.unicauca.tallerSOLID.parqueadero.*;

/**
 *
 * @author USUARIO
 */
public class TestParqueadero {
    parqueadero atrParqueadero= new parqueadero(6);
    
    public TestParqueadero() {
    }
    
    @Test
    public void testIngresoParqueaderoCamion() throws ParseException {
        assertEquals("Se ingreso el camion",true,atrParqueadero.ingresarAuto(new Camion("eee-666")));
        assertEquals("el camion se encuentra en una plaza",true, atrParqueadero.buscarPlaca("eee-666"));
      
    
    }

    @Test
    public void testSalidayFacturacionParqueaderoCamion() throws ParseException {
        assertEquals(true, atrParqueadero.salidaAuto("eee-666"));
        assertEquals("el auto no se encuentra en una plaza",false, atrParqueadero.buscarPlaca("eee-666"));
       
     
    }
    
    
    @Test
    public void testIngresoParqueaderoMoto() throws ParseException {
        assertEquals("Se ingreso la moto",true,atrParqueadero.ingresarAuto(new Moto("abc-123")));
        assertEquals("la moto se encuentra en una plaza",true, atrParqueadero.buscarPlaca("abc-123"));
      
    
    }

    @Test
    public void testSalidayFacturacionParqueaderoMoto() throws ParseException {
        assertEquals(true, atrParqueadero.salidaAuto("abc-123"));
        assertEquals("la moto no se encuentra en una plaza",false, atrParqueadero.buscarPlaca("abc-123"));
       
     
    }
    
    
     @Test
    public void testIngresoParqueaderoCarro() throws ParseException {
        assertEquals("Se ingreso la moto",true,atrParqueadero.ingresarAuto(new Carro("qwe-852")));
        assertEquals("El carro se encuentra en una plaza",true, atrParqueadero.buscarPlaca("qwe-852"));
      
    
    }

    @Test
    public void testSalidayFacturacionParqueaderoCarro() throws ParseException {
        assertEquals(true, atrParqueadero.salidaAuto("qwe-852"));
        assertEquals("El carro no se encuentra en una plaza",false, atrParqueadero.buscarPlaca("qwe-852"));
       
     
    }
    
    
    
    
}
