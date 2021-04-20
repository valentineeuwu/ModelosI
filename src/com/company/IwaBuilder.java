package com.company;

public class IwaBuilder extends PersonajeBuilder{

    @Override
    public void builderNombreAldea() {
        this.personaje.setNombreAldea("Aldea de la Piedra");
    }

    @Override
    public void builderNaturaleza() {
        this.personaje.setNaturaleza("Tierra");
    }

    @Override
    public void builderAtaque() {
        this.personaje.setAtaque(80);
    }

    @Override
    public void builderVida() {
        this.personaje.setVida(100);
    }
}
