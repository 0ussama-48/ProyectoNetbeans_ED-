/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MENU\n.........................\n" + "1.Crea tamagotchi\n" + "2.Juega con tu mascota virtual\n" + "3.Da de comer a tu mascota virtual\n" + "4.Ver la vida de tu mascota\n" + "5.Fin");
        Scanner teclado = new Scanner(System.in);
        int opcion;
        String nombre;
        Tamagochi bicho = null;
        System.out.println(".........................");
        do {
            System.out.println("Introduce una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Introduce un nombre para el tamagochi: ");
                    nombre = teclado.next();
                    bicho = new Tamagochi(nombre, 3);
                    break;
                case 2:
                    if (bicho == null) {
                        System.out.println("Crea al Tamagochi");
                    } else {

                        System.out.println(bicho.juega());

                    }
                    break;
                case 3:
                    if (bicho == null) {
                        System.out.println("Crea al Tamagochi");
                    } else {

                        System.out.println(bicho.come());

                    }
                    break;
                case 4:
                    if (bicho == null) {
                        System.out.println("Crea al Tamagochi");
                    } else {

                        System.out.println(bicho.muestraVida());

                    }
                    break;

                default:
                    break;

            }
        } while (opcion != 5);

    }

}
