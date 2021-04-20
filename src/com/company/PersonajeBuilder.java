package com.company;

public abstract class PersonajeBuilder {
    protected Personaje personaje;

    public Personaje getPersonaje() {
        return personaje;
    }

    public void crearPersonaje(){
        this.personaje = new Personaje();

    }

    public abstract void  builderNombreAldea();

    public abstract void builderNaturaleza();

    public abstract void builderAtaque();

    public abstract void builderVida();



}
