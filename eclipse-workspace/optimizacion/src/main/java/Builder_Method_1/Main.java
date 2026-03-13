package Builder_Method_1;

public class Main {
    public static void main (String[] args){
        Producto producto = new ProductoBuilder()
                .nombre("Camiseta")
                .precio(25.99)
                .color("Negro")
                .fabricante("El Niño")
                .modelo("Summer")
                .talla(37.5)
                .build();
        //Imprimir resultado
        producto.imprimirDetalles();
    }
}
