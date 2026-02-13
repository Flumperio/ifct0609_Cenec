package Interface;

public class MainClientes {
    public static void main (String[] args){
        //Variables
        String nombre = "Juan Carlos";
        String empresa = "Robert Space Industries";
        String tipo = "Argo";
        Clientes c1 = new Clientes(nombre);
        Empresa e1 = new Empresa(empresa, tipo);
        //Main
        System.out.println(c1.enviar_datos(nombre));
        System.out.println(c1.firmar(nombre));
        System.out.println(c1.mostrar_datos(nombre));
        System.out.println(c1.pagar(nombre));
        System.out.println("*********************************");
        System.out.println(e1.mostrar_datos(empresa, tipo));

    }
}
