package Prototype_Method_3;

public class MainRopa {
    public static void main (String[] args){
        //Creamos prototipo ordenador de sobremesa
        RopaTienda camisa_Tipo = new RopaTienda("Negro","Camisa", 37.5, 199.99);
        RopaTienda camisa_Vestir = camisa_Tipo.clonar();
        camisa_Vestir.impresion();
        //Clonamos el segundo ordenador
        RopaTienda camisa_Informal = camisa_Vestir.clonar();

        //Modificamos el primer clon
        camisa_Informal.setTipo("Sin cuello");
        camisa_Informal.impresion();
    }
}
