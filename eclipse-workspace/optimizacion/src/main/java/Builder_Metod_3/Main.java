package Builder_Metod_3;

public class Main {
    public static void main (String[] args){
        Cocina cocina = new Cocina();
        PizzaBuilder pizzaHaw = new PizzaHawaiana();
        PizzaBuilder pizzaCarne = new PizzaCarne();
        PizzaBuilder pizzaMon = new PizzaMontes();
        //Pizza Hawaiana
        cocina.setBuilder(pizzaHaw);
        cocina.construirPizza();
        Pizza pizzaHawaiana =  cocina.getPizza();
        pizzaHawaiana.mostrarPizza();
        //Pizza CarneLovers
        cocina.setBuilder(pizzaCarne);
        cocina.construirPizza();
        Pizza pizzaCarneLovers = cocina.getPizza();
        pizzaCarneLovers.mostrarPizza();
        //Pizza Montes
        cocina.setBuilder(pizzaMon);
        cocina.construirPizza();
        Pizza pizzaMontes = cocina.getPizza();
        pizzaMontes.mostrarPizza();
    }
}
