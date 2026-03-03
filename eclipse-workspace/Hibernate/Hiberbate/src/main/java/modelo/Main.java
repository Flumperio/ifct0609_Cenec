package modelo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class Main {

    public static void main(String[] args) {

        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        // Configurar la sesión en el contexto actual
        ThreadLocalSessionContext context = new ThreadLocalSessionContext(
        		(SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            VerDatos.vertabla("clientes");
            VerDatos.vertabla("fabricante");
            VerDatos.vertabla("productos");
            ModificarDatos.modificarNombre("clientes", 12, "Perico Of The Palots");
            VerDatos.vertabla("clientes");
            CrearRegistro.nuevoNombre("clientes", "Macho Man InTheMiddle");
            VerDatos.vertabla("clientes");
            Eliminar.borrarDatos("clientes", 31);
            VerDatos.vertabla("clientes");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            context.unbind(sessionFactory);
            sessionFactory.close();
        }
    }
}
