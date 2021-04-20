package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 1;
        boolean creo;

        ArrayList<Personaje>  ejercito = new ArrayList<>();
        Academia ac1 = new Academia();

       System.out.println(ANSI_RED + "Bienvenido al programa para añadir Ninjas al Ejercito, puedes elegir entre las diferentes aldeas disponibles"+ANSI_RESET );

     while(opcion!=0){

         System.out.println("Selecciona una opción: ");
         System.out.println("1. Añadir Ninja de la "+ ANSI_RED+"Aldea de la Hoja "+ANSI_RESET);
         System.out.println("2. Añadir Ninja de la "+ ANSI_GREEN+"Aldea de la Arena "+ANSI_RESET);
         System.out.println("3. Añadir Ninja de la "+ ANSI_YELLOW+"Aldea de la Nube "+ANSI_RESET);
         System.out.println("4. Añadir Ninja de la "+ANSI_BLUE+"Aldea de la Niebla "+ANSI_RESET);
         System.out.println("5. Añadir Ninja de la "+ANSI_PURPLE+"Aldea de la Piedra "+ANSI_RESET);
         System.out.println("6. Mostrar Ejercito");
         System.out.println("0. Salir");
         System.out.print("Opcion: ");
         opcion = Integer.parseInt(br.readLine());

         switch (opcion){
             case 1:
                 ac1.setP1(new KonohaBuilder());
                 System.out.println("Se agregó un ninja de " +ANSI_RED+"Aldea de la Hoja"+ANSI_RESET);
                 creo = true;
                 break;

             case 2:
                 ac1.setP1(new SunaBuilder());
                 System.out.println("Se agregó un ninja de "+ANSI_GREEN+" Aldea de la Arena "+ANSI_RESET);
                 creo = true;
                 break;
             case 3:
                 ac1.setP1(new KumoBuilder());
                 System.out.println("Se agregó un ninja de "+ANSI_YELLOW+"Aldea de la Nube "+ANSI_RESET);
                 creo = true;
                 break;
             case 4:
                 ac1.setP1(new KiriBuilder());
                 System.out.println("Se agregó un ninja de"+ANSI_BLUE+" Aldea de la Niebla"+ANSI_RESET);
                 creo = true;
                 break;
             case 5:
                 ac1.setP1(new IwaBuilder());
                 System.out.println("Se agregó un ninja de " +ANSI_PURPLE+"Aldea de la Piedra "+ANSI_RESET);
                 creo = true;
                 break;
             case 6:
                 System.out.println("Número de Ninjas agregados: ");
                 System.out.println(ejercito.size()+" ");
                 for(Personaje p3: ejercito){

                     System.out.println(p3.getNombreAldea() +" +Naturaleza de chakra+: " + p3.getNaturaleza() +" +Daño+: "+ p3.getAtaque() +" +Vida+: "+ p3.getVida());

                 }
                 System.out.println("Presiona enter para continuar...");
                 br.readLine();
                 creo = false;
                 break;
             default:
                 creo = false;
                 break;

         }

            if(creo){
                ac1.entrenarPersonaje();
                ejercito.add(ac1.getPersonajeConcreto()); //añadir personaje al array de ejercito
            }

         try {
             new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
         } catch (Exception e) {
            //No hacer nada
         }
     }
    }
}
