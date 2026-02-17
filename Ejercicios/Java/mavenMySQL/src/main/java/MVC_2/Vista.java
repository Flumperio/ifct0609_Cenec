package MVC_2;

public class Vista {
    //Metodos
    //Mostrar Producto
    public void mostrarProducto(int codigo, String nombre, Double precio){
        System.out.printf("ID_Producto: %s%n" +
                        "Nombre Producto: %s%n" +
                        "Precio: %.2f%n" +
                        "IVA: %.2f%n" +
                        "Precio PVP: %.2f%n",
                codigo,
                nombre,
                precio,
                precio*0.21,
                precio + (precio*0.21));
    }
}
