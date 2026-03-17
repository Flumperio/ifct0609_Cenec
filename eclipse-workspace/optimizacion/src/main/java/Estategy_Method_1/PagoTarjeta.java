package Estategy_Method_1;

class PagoTarjeta implements EstrategiaPago {
    //Atributos para el pago de Tarjeta
    private String cuenta;
    private String caducidad;
    private String cvv;
    //Constructor
    public PagoTarjeta(String cuenta, String caducidad, String cvv) {
        this.cuenta = cuenta;
        this.caducidad = caducidad;
        this.cvv = cvv;
    }
    @Override
    public void pagar(double cantidad){
        System.out.println("Pagando " + cantidad + "€, con la tarjeta: " + cuenta);
    }
}
