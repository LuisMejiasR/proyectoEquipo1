package com.generation.proyectoFinalJava;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		VehiculoTerrestre vehiculo = new VehiculoTerrestre(4,"Rojo","Con Motor",5,true,"01");

		//camioneta
		Camioneta tundra = new Camioneta();
		tundra.setCalefaccion(true);
		tundra.setNumPuertas(4);
		tundra.setAirbag(false);
		tundra.setAirbag(false);

		//moto
		Moto susuki = new Moto();
		susuki.setSoporte(true);

		System.out.println(vehiculo.toString());
		System.out.println(susuki.toString());
		System.out.println(tundra.toString());

		//hacer lista y agregar los elementos
		List<VehiculoTerrestre> listaDeVehiculos = new ArrayList<>(); //crear una lista
		listaDeVehiculos.add(vehiculo);
		listaDeVehiculos.add(susuki);
		listaDeVehiculos.add(tundra);

		//recorrer la lista para ver la aceleración
		for (VehiculoTerrestre recorrer : listaDeVehiculos) {
			recorrer.acelerar();
		}
		
		susuki.acelerar();


	}
}
