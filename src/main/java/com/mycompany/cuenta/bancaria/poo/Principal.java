package com.mycompany.cuenta.bancaria.poo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        //Creamos Objetos (Titualares de cuenta)
        CuentaBancaria cuenta1 = new CuentaBancaria("Diego", "128341243253", 222200, 0);
        CuentaBancaria cuenta2 = new CuentaBancaria("Julian", "1283412353", 2343450, 0);
        CuentaBancaria cuenta3 = new CuentaBancaria("Santiago", "1283452341233", 223432200, 0);
        CuentaBancaria cuenta4 = new CuentaBancaria("Maradona", "128345234453", 222202140, 0);

        while (true) {
            System.out.println("Ingrese la aopcion que desea gestionar: \n"
                    + "1. Ver cuentas Bancarias \n"
                    + "2. Calcular el interes de todas las cuentas \n"
                    + "3. Cambiar el tipo de interes \n"
                    + "4. Cambiar saldo \n"
                    + "5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 5:
                    System.out.println("Saliendo...");
                    return;
             }
             System.out.println();
        }

    }
}
