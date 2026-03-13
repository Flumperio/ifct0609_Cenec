package Prototype_Method_2;

public class MainOrdenador {
    public static void main (String[] args){
        //Creamos prototipo ordenador de sobremesa
        OrdenadorSobremesa PC_Sobremesa_Tipo = new OrdenadorSobremesa("AMD 7700x", "MSI G670e", 32, 1000, "AMD RX9070");
        OrdenadorSobremesa PC_Intel = PC_Sobremesa_Tipo.clonar();
        PC_Intel.especificaciones();
        //Clonamos el segundo ordenador
        OrdenadorSobremesa PC_nVidia = PC_Sobremesa_Tipo.clonar();
        PC_nVidia.especificaciones();
        //Modificamos el primer clon
        PC_Intel.setTarjeta_Grafica("Iris 100");
        PC_nVidia.setTarjeta_Grafica("RTX 5090");
        PC_Intel.especificaciones();
        PC_nVidia.especificaciones();
        PC_Sobremesa_Tipo.especificaciones();
    }
}
