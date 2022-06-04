package com.generation.f20220602;

public class VehiculoTerrestre {
    private int numRuedas;
    // color,
    private String color;
    // modelo,
    private String modelo;
    // capacidadPersonas,
    private int capacidadPersonas;
    // motor,
    private Boolean motor;
    // numeroDeSerie.
    private String numDeSerie;
	
    //constructores
    public VehiculoTerrestre() {
		super();
	}

	public VehiculoTerrestre(Integer numRuedas, String color, String modelo, int capacidadPersonas, Boolean motor,
			String numDeSerie) {
		super();
		this.numRuedas = numRuedas;
		this.color = color;
		this.modelo = modelo;
		this.capacidadPersonas = capacidadPersonas;
		this.motor = motor;
		this.numDeSerie = numDeSerie;
	}
    //getter y setter

	public Integer getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(Integer numRuedas) {
		this.numRuedas = numRuedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadPersonas() {
		return capacidadPersonas;
	}

	public void setCapacidadPersonas(int capacidadPersonas) {
		this.capacidadPersonas = capacidadPersonas;
	}

	public Boolean getMotor() {
		return motor;
	}

	public void setMotor(Boolean motor) {
		this.motor = motor;
	}

	public String getNumDeSerie() {
		return numDeSerie;
	}

	public void setNumDeSerie(String numDeSerie) {
		this.numDeSerie = numDeSerie;
	}

	@Override
	public String toString() {
		return "VehiculoTerrestre [numRuedas=" + numRuedas + ", color=" + color + ", modelo=" + modelo
				+ ", capacidadPersonas=" + capacidadPersonas + ", motor=" + motor + ", numDeSerie=" + numDeSerie + "]";
	}
    
	//funcion
	
	public void acelerar() {
		System.out.println("ChacaChacaChaca");
	}
	
	
	
}
