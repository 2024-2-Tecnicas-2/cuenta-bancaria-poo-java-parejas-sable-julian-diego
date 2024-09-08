package com.mycompany.cuenta.bancaria.poo;
 
import java.util.ArrayList;
 
public class CuentaBancaria {
 
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres;
   ArrayList<CuentaBancaria> cuenta = new ArrayList<>();

 
    public CuentaBancaria(String titular, String numeroCuenta, double saldo, double tipoInteres) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = 0.15;
    }
 
    public String getTitular() {
        return titular;
    }
 
    public void setTitular(String titular) {
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
 
    public void AgregarCuenta(CuentaBancaria v) {
        cuenta.add(v);
    }
    public void mostrarCuentas(){
        System.out.println("nombre titular: "+this.titular+" El número de cuenta es: "+this.cuenta+" El saldo de la cuenta es: "+this.saldo+" el tipo de interes es: "+this.tipoInteres);
    }

    public class listaCuentas {

        public listaCuentas() {
        }
    }

   
}