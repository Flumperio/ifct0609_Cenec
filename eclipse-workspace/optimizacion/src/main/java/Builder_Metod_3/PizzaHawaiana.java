package Builder_Metod_3;

public class PizzaHawaiana implements PizzaBuilder {
    //Atributos
    private Pizza pizza;
    //Constructor
    public PizzaHawaiana() {
        pizza = new Pizza("Masa", "Salsa", "Relleno", "Tamaño");
    }
    //Overrride del Interfaz
    @Override
    public void construirMasa() {
        pizza.masa = "Super Gorda";
    }

    @Override
    public void construirSalsa() {
        pizza.salsa = "Tomate";
    }

    @Override
    public void construirRelleno() {
        pizza.relleno = "Beicon, Piña y Queso";
    }

    @Override
    public void construirSize () {
        pizza.size = "Familiar";
    }

    @Override
    public Pizza getPizza(){
        return pizza;
    }

}
