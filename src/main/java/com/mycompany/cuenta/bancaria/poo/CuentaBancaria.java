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
    
        
     public String getTitular() {
        return titular;
    }

    public  void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double ingresar(double cantidad) {

        return 0;
    }

    public double retirar(double cantidad) {
        return 0;
    }
    public void calcularInteres(){
    
    }

   
    
   
    
    
}
