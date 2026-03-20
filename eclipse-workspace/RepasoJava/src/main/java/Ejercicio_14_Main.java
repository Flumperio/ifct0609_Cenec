public class Ejercicio_14_Main {
    static class Ordenador {
        //Atributos
        private String marca;
        private int memoriaRAM;
        private int discoDuro;

        //Constructor
        public Ordenador(String marca, int memoriaRAM, int discoDuro) {
            this.marca = marca;
            this.memoriaRAM = memoriaRAM;
            this.discoDuro = discoDuro;
        }

        //Metodos
        public void mostrarCaracteristicas() {
            System.out.println("--------------------");
            System.out.println("Ordenador:\n" +
                    "Marca = " + marca +
                    "\nRAM = " + memoriaRAM + "GB" +
                    "\nDisco duro = " + discoDuro + "GB");
            System.out.println("--------------------");
        }
    }

    //Main
    public static void main (String[] args){
        //Variables
        Ordenador pc1 = new Ordenador("Apple En De Vé", 96, 1024);
        Ordenador pc2 = new Ordenador("HP En Verdá", 8, 256);
        Ordenador pc3 = new Ordenador("Lenovo ToGuapo", 32, 512);

        //Programa
        pc1.mostrarCaracteristicas();
        pc2.mostrarCaracteristicas();
        pc3.mostrarCaracteristicas();
    }
}
