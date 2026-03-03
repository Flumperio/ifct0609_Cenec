package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;

public class VerDatos {

    public static void vertabla(String tabla) {

        String hql;

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

            // Crear consulta HQL para seleccionar todos los registros de la tabla fabricante
            switch (tabla.toLowerCase()) {
                case "fabricante" -> hql = "FROM Fabricante";
                case "clientes" -> hql = "FROM Cliente";
                case "productos" -> hql = "FROM Producto";
                default -> {
                    System.out.println("❌ Opción inválida. Mostrando Fabricante.");
                    hql = "FROM Fabricante";
                }
            }
            Query<?> query = session.createQuery(hql);

            // Ejecutar consulta y obtener resultados
            List<?> resultados = query.list();

            // Imprimir resultados
            System.out.println("Registros en la tabla seleccionada:");
            for (Object cnt : resultados) {
                System.out.println(cnt.toString());
            }

            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            context.unbind(sessionFactory);
            sessionFactory.close();
        }
    }
}
