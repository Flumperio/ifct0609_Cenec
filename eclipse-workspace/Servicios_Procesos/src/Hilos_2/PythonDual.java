package Hilos_2;

public class PythonDual extends Thread {
    private int notas;
    private String asignatura;

    public PythonDual(int notas, String asignatura) {
        this.asignatura = asignatura;
        this.notas = notas;
    }
    public void run() {
        double empresa = (notas * 40) / 100;
        System.out.println("la nota de " + asignatura + " en la empresa es: " + empresa);
        System.out.println("la nota de " + asignatura + " en el centro de formación es: " + (notas - empresa));
    }
}
