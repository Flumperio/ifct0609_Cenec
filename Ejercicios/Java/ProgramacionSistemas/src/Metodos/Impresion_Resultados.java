package Metodos;

public class Impresion_Resultados {
    public void cabecera (String nombre){
        int len = nombre.length();
        int total = 20;
        if (len % 2 == 0) total++;  // Ajuste paridad
        // Línea superior
        for (int i = 0; i < total; i++) System.out.print("*");
        System.out.println();
        // Línea centrada
        int espacios = (total - len) / 2;
        for (int i = 0; i < espacios; i++) System.out.print("*");
        System.out.print(" " + nombre + " ");
        for (int i = 0; i < total - espacios - len - 1; i++) System.out.print("*");
        System.out.println();
        // Línea inferior
        for (int i = 0; i < total; i++) System.out.print("*");
        System.out.println();
}
