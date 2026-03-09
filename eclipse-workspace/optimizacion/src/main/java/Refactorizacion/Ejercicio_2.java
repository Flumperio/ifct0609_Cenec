package Refactorizacion;

public class Ejercicio_2 {
    public static double calcularSalarioNeto(double horasTrabajadas, double tarifaHora) {
        double salarioBruto = horasTrabajadas * tarifaHora;
        double impuestos = salarioBruto * 0.15;
        double salarioNeto = salarioBruto - impuestos;
        return salarioNeto;
    }

    public static void main(String[] args) {
        double horasTrabajadas = 40;
        double tarifaHora = 20;

        double salarioNeto = calcularSalarioNeto(horasTrabajadas, tarifaHora);
        System.out.println("Salario neto: " + salarioNeto);
    }
}
