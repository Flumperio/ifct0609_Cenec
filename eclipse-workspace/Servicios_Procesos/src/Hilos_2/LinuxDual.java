package Hilos_2;

public class LinuxDual extends Thread {
    private int notas;
    private String asignatura;

    public LinuxDual(int notas, String asignatura) {

        this.notas = notas;
        this.asignatura = asignatura;
    }
    public void run() {
        double empresa = (notas * 80) / 100;
        System.out.println("la nota de " + asignatura + " en la empresa es: " + empresa);
        System.out.println("la nota de " + asignatura + " en el centro de formación es: " + (notas - empresa));
    }
}
