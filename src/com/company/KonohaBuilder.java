package com.company;

public class KonohaBuilder extends PersonajeBuilder{

    @Override
    public void builderNombreAldea() {
        this.personaje.setNombreAldea("Aldea de la Hoja");
    }

    @Override
    public void builderNaturaleza() {
        this.personaje.setNaturaleza("Viento");

    }

    @Override
    public void builderAtaque() {
    this.personaje.setAtaque(100);
    }

    @Override
    public void builderVida() {
    this.personaje.setVida(100);
    }
}
