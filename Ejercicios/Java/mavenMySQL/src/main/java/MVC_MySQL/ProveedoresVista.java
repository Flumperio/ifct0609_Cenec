package MVC_MySQL;

import java.util.ArrayList;

public class ProveedoresVista {
    public void mostrarProveedores(ArrayList<Proveedores> listaProveedores){
        System.out.println("Listado de proveedores");

        for(Proveedores prov : listaProveedores){
            System.out.println(
                    "ID: " + prov.getId()
                    + " | Nombre: " + prov.getNombre()
                    + " | Teléfono: " + prov.getTelefono()
                    + " | eMail: " + prov.getEmail()
            );
        }
    }
}
