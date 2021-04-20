package com.company;

public class Academia  {
    private PersonajeBuilder p1;

    public void setP1(PersonajeBuilder p1) {
        this.p1 = p1;
    }

    public Personaje getPersonajeConcreto(){
        return p1.getPersonaje();
    }

    public void entrenarPersonaje(){
        p1.crearPersonaje();
        p1.builderNombreAldea();
        p1.builderNaturaleza();
        p1.builderAtaque();
        p1.builderVida();


    }
}
