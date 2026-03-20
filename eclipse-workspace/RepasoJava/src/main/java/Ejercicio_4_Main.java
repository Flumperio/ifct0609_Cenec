public class Ejercicio_4_Main {
    static class Rectangulo {
        //Atributos
        private double base;
        private double altura;
        //Constructor
        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }
        //Metodos
        public double calcularArea() {
            return base * altura;
        }
        public double calcularPerimetro() {
            return 2 * (base + altura);
        }
    }
    //Main
    public static void main (String[] args){
        //Variables
        Rectangulo rectangulo = new Rectangulo( 8.5, 7.0);

        System.out.println("El area del rectángulo es: " + rectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());


    }
}
