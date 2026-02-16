//package ArrayList;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//public class Ejercicio_11 {
//    public static void main(String[] args){
//        //Definición variables
//        var productos = new ArrayList<Producto>();
//        Producto mas_Caro = productos.get(0);
//        int numeroEntradas;
//        double precio, precio_Max = 0.0;
//        String nombre;
//        Scanner teclado = new Scanner(System.in);
//        //Entrada Datos
//        System.out.println("Introduce el número de Productos: ");
//        numeroEntradas = teclado.nextInt();
//        for (int cnt = 0; cnt < numeroEntradas; cnt ++){
//            System.out.print("Nombre del Producto: ");
//            nombre = teclado.next();
//            System.out.print("\nPrecio: ");
//            precio = teclado.nextDouble();
//            productos.add(new Producto(nombre, precio));
//        }
//        //Main
//        for (var pro : productos) {
//            System.out.println(pro.nombre + " -- " + pro.precio);
//            if(precio_Max < pro.getPrecio()){
//                mas_Caro = pro;
//            }
//        }
//        System.out.println("De que alumno quieres saber la nota: ");
//        for (ArrayList.Ejercicio_11.Producto cnt : productos){
//            if (cnt.nombre.equals("a")){
//                System.out.println("La nota del alumno " + cnt.nombre + " es: " + cnt.precio);
//            }
//        }
//
//        //Impresion
//        //Cerramos clases abiertas
//        teclado.close();
//    }
//    //Clase pública de pruebas
//        public static class Producto {
//        //Atributos
//        public String nombre;
//        public double precio;
//        //Constructor
//        public Producto(String nombre, double precio) {
//            this.nombre = nombre;
//            this.precio = precio;
//        }
//
//        public String getNombre() {
//            return nombre;
//        }
//        public void setNombre(String nombre) {
//            this.nombre = nombre;
//        }
//        public double getPrecio() {
//            return precio;
//        }
//        public void setPrecio(double precio) {
//            this.precio = precio;
//        }
//    }
//}
