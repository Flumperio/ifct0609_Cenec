package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class ModificarDatos {

    public static void modificarNombre(String tabla, int id, String nuevo_nombre) {

        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            Session session = context.currentSession();
            session.beginTransaction();

            // 🔄 UPDATE DINÁMICO por tabla_sel
            switch (tabla.toLowerCase()) {
                case "clientes" -> {
                    VerDatos.vertabla(tabla);
                    Cliente cliente = session.get(Cliente.class, id);
                    if (cliente != null) {
                        cliente.setNombre(nuevo_nombre);
                        session.update(cliente);
                        System.out.println("✅ Cliente ID " + id + " actualizado");
                    }
                }
                case "productos" -> {
                    Producto producto = session.get(Producto.class, id);
                    if (producto != null) {
                        producto.setNombre(nuevo_nombre);
                        session.update(producto);
                        System.out.println("✅ Producto ID " + id + " actualizado");
                    }
                }
                case "fabricante" -> {
                    Fabricante fabricante = session.get(Fabricante.class, id);
                    if (fabricante != null) {
                        fabricante.setNombre(nuevo_nombre);  // ← setFabricante()
                        session.update(fabricante);
                        System.out.println("✅ Fabricante ID " + id + " actualizado");
                    }
                }
                default -> System.out.println("❌ Tabla no soportada: " + tabla);
            }

            // 🔍 Verificar resultado
            String selectHql;
            switch (tabla.toLowerCase()) {
                case "clientes" -> selectHql = "FROM Cliente WHERE id = :id";
                case "productos" -> selectHql = "FROM Producto WHERE id = :id";
                case "fabricante" -> selectHql = "FROM Fabricante WHERE id = :id";
                default -> selectHql = "FROM Cliente WHERE id = :id";
            }

            var selectQuery = session.createQuery(selectHql);
            selectQuery.setParameter("id", id);
            var resultados = selectQuery.list();

            System.out.println("\n📋 Resultado actualizado:");
            resultados.forEach(obj -> System.out.println(obj));

            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            context.unbind(sessionFactory);
            sessionFactory.close();
        }
    }
}
