package Builder_Metod_3;

class Cocina {
    //Crea el interfaz Builder para crear la pizza
    private PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }
    public Pizza getPizza() {
        return builder.getPizza();
    }
    //Construir Pizza
    public void construirPizza(){
        builder.construirMasa();
        builder.construirSalsa();
        builder.construirRelleno();
        builder.construirSize();
    }
}
