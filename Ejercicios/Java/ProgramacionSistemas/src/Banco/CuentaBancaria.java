package Banco;

import javax.swing.*;

public class CuentaBancaria extends Banco{
    //Atributos
    private int n_cuenta;
    private double saldo;
    //Constructor
    public CuentaBancaria(String n_banco, int n_cuenta, double saldo) {
        super(n_banco);
        this.n_cuenta = n_cuenta;
        this.saldo = saldo;
    }
    //Setter y Getter
    public int getN_cuenta() {
        return n_cuenta;
    }
    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //Operaciones
    //Ingresar
    public void ingresar (double importe){
        if (importe <= 0){
            JOptionPane.showMessageDialog(null, "Error. El importe no puede ser menor que 1.", "Banco", 1);
        }
    }
}
