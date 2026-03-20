public class Ejercicio_5_Main {
    static class CuentaBancaria {
        //Atributos
        private String titular;
        private double saldo;
        //Constructor
        public CuentaBancaria(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;
        }
        //Metodos
        public void ingresar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                System.out.println("Has metido en la saca: " + cantidad + "€");
            } else {
                System.out.println("Cantidad inválida");
            }
        }
        public void retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Has sacado: " + cantidad + "€");
            } else {
                System.out.println("Quieres retirar " + cantidad +"€. \nO estás más tieso que la mojama, o no sabes teclear");
            }
        }
        public void mostrarSaldo() {
            System.out.println("--------------------");
            System.out.println("Cuenta:\n" +
                    "Titular=" + titular +
                    "\nSaldo=" + saldo + "€");
            System.out.println("--------------------");
        }
    }
    //Main
    public static void main (String[] args){
        //Variables
        CuentaBancaria cuenta = new CuentaBancaria("Carlos", 1000.0);
        //Programa
        cuenta.mostrarSaldo();
        cuenta.ingresar(500.0);
        cuenta.retirar(200.0);
        cuenta.retirar(1500.0);  // Prueba saldo insuficiente
        cuenta.mostrarSaldo();
    }
}
