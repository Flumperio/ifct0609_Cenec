package Builder_Metod_3;

public class PizzaMontes implements PizzaBuilder {
    //Atributos
    private Pizza pizza;
    //Constructor
    public PizzaMontes() {
        pizza = new Pizza("Masa", "Salsa", "Relleno", "Tamaño");
    }
    //Overrride del Interfaz
    @Override
    public void construirMasa() {
        pizza.masa = "Gorda";
    }

    @Override
    public void construirSalsa() {
        pizza.salsa = "Tomate y Anchoas";
    }

    @Override
    public void construirRelleno() {
        pizza.relleno = "Carne, Merluza, Beicon" ;
    }

    @Override
    public void construirSize () {
        pizza.size = "Familiar XXL";
    }

    @Override
    public Pizza getPizza(){
        return pizza;
    }

}
