package com.generation.proyectoFinalJava.pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.generation.proyectoFinalJava.Camioneta;
import com.generation.proyectoFinalJava.Moto;
import com.generation.proyectoFinalJava.VehiculoTerrestre;


public class TestVehiculos {
	
	@Test
	public void testVehiculo() {
		VehiculoTerrestre vehiculo = new VehiculoTerrestre();
		String prueba1 = vehiculo.acelerar();
		
		assertEquals("ChacaChacaChaca", prueba1);
	}
	
	@Test
	public void testMoto() {
		Moto moto = new Moto();
		String prueba2 = moto.acelerar();
		
		assertEquals("Fiiiiuuuuum", prueba2);
		
	}
	
	@Test
	public void testCamioneta() {
		Camioneta camioneta = new Camioneta();
		String prueba3 = camioneta.acelerar();
		
		assertEquals("Bruuuum", prueba3);
		
	}
	
	@Test
	public void testMotoBaseApoyo() {
		Moto moto = new Moto();
		Boolean prueba4 = moto.baseApoyo();
		
		assertEquals(true, prueba4);
		assertNotEquals(false, prueba4);
		assertNotEquals("Si, tu moto tiene patita", prueba4);
		
	}
	
	@Test
	public void aireAcondicionado() {
        Camioneta camioneta= new Camioneta();
        Boolean prueba5 = camioneta.aireAcondicionado();
        
        assertEquals(true, prueba5);
        
    }

}
