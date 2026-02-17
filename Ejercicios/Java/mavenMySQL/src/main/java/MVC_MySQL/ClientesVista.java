package MVC_MySQL;

import java.util.ArrayList;

public class ClientesVista {
    public void mostrarClientes(ArrayList<Cliente> listaCliente){
        System.out.println("Listado de clientes");

        for(Cliente c : listaCliente){

            System.out.println(
                    "ID: " + c.getId()
                    + " | NIF: " + c.getNif()
                    + " | Nombre: " + c.getNombre()
                    + " | Edad: " + c.getEdad()
            );
        }
    }

}
