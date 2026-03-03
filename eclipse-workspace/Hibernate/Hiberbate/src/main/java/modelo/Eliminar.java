package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;

public class Eliminar {

    public static void borrarDatos(String tabla, int id) {

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

            switch (tabla.toLowerCase()) {
                case "clientes" -> {
                    String deleteHql = "DELETE FROM Cliente WHERE id = :id";
                    int filas = session.createQuery(deleteHql)
                            .setParameter("id", id)
                            .executeUpdate();
                    System.out.println("✅ ID Cliente: " + filas + " borrado.");
                }
                case "productos" -> {
                    String deleteHql = "DELETE FROM Producto WHERE id = :id";
                    int filas = session.createQuery(deleteHql)
                            .setParameter("id", id)
                            .executeUpdate();
                    System.out.println("✅ ID Producto: " + filas + " borrado.");
                }
                case "fabricante" -> {
                    String deleteHql = "DELETE FROM Fabricante WHERE id = :id";
                    int filas = session.createQuery(deleteHql)
                            .setParameter("id", id)
                            .executeUpdate();
                    System.out.println("✅ ID Fabricante: " + filas + " borrado.");
                }
                default -> System.out.println("❌ Tabla no soportada: " + tabla);
            }
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
