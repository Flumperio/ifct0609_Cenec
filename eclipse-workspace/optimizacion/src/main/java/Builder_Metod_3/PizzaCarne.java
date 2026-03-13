package Builder_Metod_3;

public class PizzaCarne implements PizzaBuilder {
    //Atributos
    private Pizza pizza;
    //Constructor
    public PizzaCarne() {
        pizza = new Pizza("Masa", "Salsa", "Relleno", "Tamaño");
    }
    //Overrride del Interfaz
    @Override
    public void construirMasa() {
        pizza.masa = "Fina";
    }

    @Override
    public void construirSalsa() {
        pizza.salsa = "Tomate y Oregano";
    }

    @Override
    public void construirRelleno() {
        pizza.relleno = "Carne, Carne, Carne";
    }

    @Override
    public void construirSize () {
        pizza.size = "Mediana";
    }

    @Override
    public Pizza getPizza(){
        return pizza;
    }

}
