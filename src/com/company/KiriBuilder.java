package com.company;

public class KiriBuilder extends PersonajeBuilder{

    @Override
    public void builderNombreAldea() {
        this.personaje.setNombreAldea("Aldea de la Niebla");
    }

    @Override
    public void builderNaturaleza() {
        this.personaje.setNaturaleza("Agua");
    }

    @Override
    public void builderAtaque() {
        this.personaje.setAtaque(95);
    }

    @Override
    public void builderVida() {
        this.personaje.setVida(80);
    }
}
