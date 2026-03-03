package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;

public class CrearRegistro {

    public static void nuevoNombre(String tabla, String nombre_nuevo) {

        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        // Configurar la sesión en el contexto actual
        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            // Obtener la sesión actual
            Session session = context.currentSession();

            // Iniciar transacción
            session.beginTransaction();

            VerDatos.vertabla(tabla);

            switch (tabla.toLowerCase()) {
                case "clientes" -> {
                    Cliente nuevoCliente = new Cliente();
                    nuevoCliente.setNombre(nombre_nuevo);
                    // Configura otros atributos según la estructura de tu entidad fabricante
                    session.save(nuevoCliente);
                    System.out.println("✅ Cliente: " + nombre_nuevo + " añadido");
                }
                case "productos" -> {
                    Producto nuevoProducto = new Producto();
                    nuevoProducto.setNombre(nombre_nuevo);
                    // Configura otros atributos según la estructura de tu entidad fabricante
                    session.save(nuevoProducto);
                    System.out.println("✅ Producto: " + nombre_nuevo + " añadido");
                }
                case "fabricante" -> {
                    Fabricante nuevoFabricante = new Fabricante();
                    nuevoFabricante.setNombre(nombre_nuevo);
                    // Configura otros atributos según la estructura de tu entidad fabricante
                    session.save(nuevoFabricante);
                    System.out.println("✅ Fabricante: " + nombre_nuevo + " añadido");
                    }
                default -> System.out.println("❌ Tabla no soportada: " + tabla);
            }
            VerDatos.vertabla(tabla);
            // Hacer commit de la transacción
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            context.unbind(sessionFactory);
            sessionFactory.close();
        }
    }
}

