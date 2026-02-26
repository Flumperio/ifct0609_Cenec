package Hilos_2;

public class BaseDatosDual extends Thread {
    private int notas;
    private String asignatura;

    public BaseDatosDual(int notas, String asignatura) {

        this.notas = notas;
        this.asignatura = asignatura;
    }
    public void run() {
        double empresa = (notas * 20) / 100;
        System.out.println("la nota de " + asignatura + " en la empresa es: " + empresa);
        System.out.println("la nota de " + asignatura + " en el centro de formación es: " + (notas - empresa));
    }
}
