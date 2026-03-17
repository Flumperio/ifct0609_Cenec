package Estategy_Method_2;

class ContextoPago {
    //Atributo para asociación de clases
    private EstrategiaPago estrategiaPago;
    //Constructor
    public ContextoPago(EstrategiaPago estrategiaPago){
        this.estrategiaPago = estrategiaPago;
    }
    //Metodo para pagar
    public void pagar (double cantidad){
        estrategiaPago.pagar(cantidad);
    }
}
