package src;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            cls();
            System.out.print("\nMENU");
            System.out.print("\n====");
            System.out.print("\n(1) walter suma");
            System.out.print("\n(2) walter resta");
            System.out.print("\n(3) ismael multiplicación");
            System.out.print("\n(4) ismael división");
            System.out.print("\n(0) Salir\n");

            System.out.print("\nOpcion? ");
            opcion = sc.next().trim().charAt(0);

            switch (opcion) {
                case '1':
                    cls();
                    walter_suma();
                    pause();
                    break;
                case '2':
                    cls();
                    walter_resta();
                    pause();
                    break;
                case '3':
                    cls();
                    ismael_multiplicacion();
                    pause();
                    break;
                case '4':
                    cls();
                    ismael_division();
                    pause();
                    break;
                case '0':
                    cls();
                    System.exit(0);
                    break;
            }
        } while (true);

    }

    public static void walter_suma() {
        System.out.print("\nSUMA");
        System.out.print("\n====");
        System.out.println("\nOK TERMINE LA SUMA");
    }

    public static void walter_resta() {
        System.out.print("\nRESTA");
        System.out.print("\n=====");
        System.out.println("\nOK TERMINE LA RESTA");
    }

    public static void ismael_multiplicacion() {
        System.out.print("\nMULTIPLICACION");
        System.out.print("\n==============");
        System.out.println("\nOK YA TERMINE LA MULTIPLICACION");
    }

    public static void ismael_division() {
        System.out.print("\nDIVISION");
        System.out.print("\n========");
        System.out.println("\n");
    }

    public static void algonuevo() {
        System.out.println();
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }
}
