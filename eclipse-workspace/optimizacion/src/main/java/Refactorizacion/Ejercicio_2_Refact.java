package Refactorizacion;

public class Ejercicio_2_Refact {
    public static double calcularSalarioNeto(double horasTrabajadas, double tarifaHora) {
        double salarioBruto = calcularSalarioBruto(horasTrabajadas, tarifaHora);
        double impuestos = calcularImpuestos(salarioBruto);
        return calcularNeto(salarioBruto, impuestos);
    }

    private static double calcularSalarioBruto(double horasTrabajadas, double tarifaHora) {
        return horasTrabajadas * tarifaHora;
    }

    private static double calcularImpuestos(double salarioBruto) {
        return salarioBruto * 0.15;
    }

    private static double calcularNeto(double salarioBruto, double impuestos) {
        return salarioBruto - impuestos;
    }

    public static void main(String[] args) {
        double horasTrabajadas = 40;
        double tarifaHora = 20;

        double salarioNeto = calcularSalarioNeto(horasTrabajadas, tarifaHora);
        System.out.println("Salario neto: " + salarioNeto);
    }
}

