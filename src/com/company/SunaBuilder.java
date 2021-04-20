package com.company;

public class SunaBuilder extends PersonajeBuilder {

    @Override
    public void builderNombreAldea() {
        this.personaje.setNombreAldea("Aldea de la Arena");
    }

    @Override
    public void builderNaturaleza() {
        this.personaje.setNaturaleza("Fuego");
    }

    @Override
    public void builderAtaque() {
        this.personaje.setAtaque(90);
    }

    @Override
    public void builderVida() {
        this.personaje.setVida(100);
    }
}
