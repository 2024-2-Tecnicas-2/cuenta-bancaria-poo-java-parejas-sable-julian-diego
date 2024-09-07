package com.mycompany.cuenta.bancaria.poo;
 
public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cuenta1= new CuentaBancaria("dIEGO", "124521", 2453,0);
        cuenta1.AgregarCuenta(cuenta1);
        cuenta1.mostrarCuentas();
        System.out.println("La cuenta es: ");
    }
}