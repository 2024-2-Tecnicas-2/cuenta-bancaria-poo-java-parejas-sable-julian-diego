package com.mycompany.cuenta.bancaria.poo;

public class CuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo, double tipoInteres) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = 0.15;
    }
    
  
    

    public double ingresar(double cantidad) {

        return 0;
    }

    public double retirar(double cantidad) {
        return 0;
    }
    public void calcularInteres(){
    
    }
    
    public double setTipoInteres(double tipoInteres){
    
    return 0;
    }
}
