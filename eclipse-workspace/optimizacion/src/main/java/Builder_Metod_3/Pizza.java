package Builder_Metod_3;

class Pizza {
    //Atributos Pizza
    String masa, salsa, relleno, size;
    //Constructor
    public Pizza(String masa, String salsa, String relleno, String size) {
        this.masa = masa;
        this.salsa = salsa;
        this.relleno = relleno;
        this.size = size;
    }
    //Metodo para mostrar la pizza
    public void mostrarPizza(){
        System.out.println("Pizza: \nMasa-" + masa
                + ", \nSalsa-" + salsa
                + ", \nRelleno-" + relleno
                + ", \nTamaño: " + size);
    }

}
