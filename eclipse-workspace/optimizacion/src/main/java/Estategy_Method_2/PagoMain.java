package Estategy_Method_2;

public class PagoMain {
    public static void main (String[] args){
        //Creamos contexto
        ContextoPago contexto;
        //Estrategias de pago
        EstrategiaPago pagoPayPal = new PagoPayPal("jcsantos@icloud.com", "misjum");
        EstrategiaPago pagoTarjeta = new PagoTarjeta("3434 3949 39394 39234 1111", "01/26", "988");
        EstrategiaPago pagoBitcoin  =  new PagoBitCoin("u08r43y3ufywenf8ehf890e7wfn9ewuwyrrh4");

        //Contexto con la estrategia con Paypal
        contexto = new ContextoPago(pagoPayPal);
        contexto.pagar(50.0);
        contexto = new ContextoPago(pagoTarjeta);
        contexto.pagar(1000.0);
        contexto = new ContextoPago(pagoBitcoin);
        contexto.pagar(120.0);
    }
}
