package com.generation.f20220602;

public class Moto {
    private Boolean soporte;
    private String tipoMoto;
    private String posicionConduccion;

    public Moto() {
    }

    public Moto(Boolean soporte, String tipoMoto, String posicionConduccion) {
        this.soporte = soporte;
        this.tipoMoto = tipoMoto;
        this.posicionConduccion = posicionConduccion;
    }

    public Boolean getSoporte() {
        return soporte;
    }

    public void setSoporte(Boolean soporte) {
        this.soporte = soporte;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public String getPosicionConduccion() {
        return posicionConduccion;
    }

    public void setPosicionConduccion(String posicionConduccion) {
        this.posicionConduccion = posicionConduccion;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "soporte=" + soporte +
                ", tipoMoto='" + tipoMoto + '\'' +
                ", posicionConduccion='" + posicionConduccion + '\'' + super.toString() +
                '}';
    }


    public void acelerar() {
        System.out.println("Fiiiiuuuuum");
    }

    public void baseApoyo() {
        System.out.println("Si, tu moto tiene patita");
    }


}




















