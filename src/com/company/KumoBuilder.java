package com.company;

public class KumoBuilder extends PersonajeBuilder {

    @Override
    public void builderNombreAldea() {
        this.personaje.setNombreAldea("Aldea de la Nube");
    }

    @Override
    public void builderNaturaleza() {
        this.personaje.setNaturaleza("Rayo");

    }

    @Override
    public void builderAtaque() {
        this.personaje.setAtaque(85);
    }

    @Override
    public void builderVida() {
        this.personaje.setVida(95);
    }
}
