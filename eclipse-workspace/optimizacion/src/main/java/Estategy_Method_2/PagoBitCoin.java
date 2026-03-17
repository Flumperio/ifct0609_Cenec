package Estategy_Method_2;

class PagoBitCoin implements EstrategiaPago {
    //Atributos para el pago de paypal
    private String token;
    //Constructor
    public PagoBitCoin(String token) {
        this.token = token;
    }
    @Override
    public void pagar(double cantidad){
        System.out.println("Pagando " + cantidad + "€, con BitCoin token " + token);
    }
}
