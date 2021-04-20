package com.company;

public class Personaje {

    private String nombreAldea;
    private String naturaleza;
    private int ataque;
    private int vida;

    public String getNombreAldea() {
        return nombreAldea;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setNombreAldea(String nombre) {
        this.nombreAldea = nombre;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
