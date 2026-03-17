package Proxy_Method;

public class Proxy_Main {
    public static void main (String[] args){
        Documento documento = new ProxyDocumento("documento.pdf");

        //El documento se carga y muestra el primer acceso
        documento.mostrar();

        //El documento se muestra sin cargar en el segundo acceso.
        documento.mostrar();

    }
}
