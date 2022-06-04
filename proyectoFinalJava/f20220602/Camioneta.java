package com.generation.f20220602;

public class Camioneta extends VehiculoTerrestre{

    //atributos
    private Boolean calefaccion;
    private int numPuertas;
    private Boolean airbag;
    private Boolean cinturoSeguridad;

    //contructor vacio
    public Camioneta() {
        super();
    }

    //constructor con parametros
    public Camioneta(Boolean calefaccion, int numPuertas, Boolean airbag, Boolean cinturoSeguridad) {
        super();
        this.calefaccion = calefaccion;
        this.numPuertas = numPuertas;
        this.airbag = airbag;
        this.cinturoSeguridad = cinturoSeguridad;
    }

    //Getter and Setter

    public Boolean getCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(Boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Boolean getAirbag() {
        return airbag;
    }

    public void setAirbag(Boolean airbag) {
        this.airbag = airbag;
    }

    public Boolean getCinturoSeguridad() {
        return cinturoSeguridad;
    }

    public void setCinturoSeguridad(Boolean cinturoSeguridad) {
        this.cinturoSeguridad = cinturoSeguridad;
    }

    //toString

    @Override
    public String toString() {
        return "Camioneta{" +
                "calefaccion=" + calefaccion +
                ", numPuertas=" + numPuertas +
                ", airbag=" + airbag +
                ", cinturoSeguridad=" + cinturoSeguridad + super.toString() +
                '}';
    }

    //Polimorfismo
    public void acelerar() {
        System.out.println("Bruuuum");
    }

    //Funcion
    public void aireAcondicionado() {
        System.out.println("Posee calefacción.");
    }


}