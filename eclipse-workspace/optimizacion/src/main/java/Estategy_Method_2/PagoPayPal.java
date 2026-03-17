package Estategy_Method_2;

class PagoPayPal implements EstrategiaPago {
    //Atributos para el pago de paypal
    private String correo;
    private String contrasenia;
    //Constructor
    public PagoPayPal(String correo, String contrasenia) {
        this.correo = correo;
        this.contrasenia = contrasenia;
    }
    @Override
    public void pagar(double cantidad){
        System.out.println("Pagando " + cantidad + "€, con PayPal de: " + correo);
    }
}
