
package MySQL_Swing;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * CRUD Swing + DAO + Conexión en UNA sola clase
 *
 * BD: empresa1
 * Tabla: clientes
 *
 * Estructura (según tu captura):
 *   id     INT(10)      NOT NULL   (NO AUTOINCREMENT)
 *   nif    VARCHAR(10)  NOT NULL
 *   nombre VARCHAR(60)  NOT NULL
 *   edad   VARCHAR(2)   NULL
 */
public class Crud_SQL_Productos extends JFrame {

    // =========================
    // CONFIGURACIÓN DB (AJUSTA SOLO USER/PASS SI HACE FALTA)
    // =========================
    private static final String DB_NAME = "empresa1";
    private static final String TABLE = "productos";
    private static final String URL =
            "jdbc:mysql://localhost:3306/" + DB_NAME;
    private static final String USER = "dev";
    private static final String PASS = "password"; // <-- pon tu contraseña si tienes

    // =========================
    // UI
    // =========================
    private final JTextField txtId = new JTextField();  //usamos final para hacer que sea mas seguro, impide darle otro valor a esta variable que hace referencia a unobjeto
    private final JTextField txtNombre = new JTextField();
    private final JTextField txtPrecio = new JTextField();

    //con este codigo guardamos los datos de la tabla indicando fila y columna
    private final DefaultTableModel modelo = new DefaultTableModel(
            new Object[] { "ID", "NOMBRE", "PRECIO" }, 0
    ) {
        @Override public boolean isCellEditable(int row, int col) {
            return false;
        }
    };

    //creamos la referencia al objeto jtable
    private final JTable tabla = new JTable(modelo);
    //indicamos los botones
    private final JButton btnInsertar   = new JButton("Insertar");
    private final JButton btnActualizar = new JButton("Actualizar");
    private final JButton btnEliminar   = new JButton("Eliminar");
    private final JButton btnBuscar     = new JButton("Buscar (ID)");
    private final JButton btnListar     = new JButton("Listar");
    private final JButton btnLimpiar    = new JButton("Limpiar");

    // =========================
    // MAIN
    // =========================

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } //UIMANGER conesto creamos un estilo
        catch (Exception ignored) {}
        SwingUtilities.invokeLater(Crud_SQL_Productos::new);
    }

    // =========================
    // CONSTRUCTOR
    // =========================
    public Crud_SQL_Productos() {
        setTitle("CRUD Productos (empresa1.productos) - Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(860, 520);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // id es MANUAL (no autoincrement)
        txtId.setEditable(true);
        txtId.setBackground(Color.WHITE);

        add(crearPanelFormulario(), BorderLayout.NORTH);
        add(crearPanelTabla(), BorderLayout.CENTER);
        add(crearPanelBotones(), BorderLayout.SOUTH);

        configurarEventos();
        cargarTabla();

        setVisible(true);
    }

    // =========================
    // PANEL FORMULARIO
    // =========================
    private JPanel crearPanelFormulario() {
        JPanel p = new JPanel(new GridLayout(2, 4, 10, 10));
        p.setBorder(new TitledBorder("Datos del Producto"));

        p.add(new JLabel("ID:"));
        p.add(new JLabel("NOMBRE:"));
        p.add(new JLabel("PRECIO: "));

        p.add(txtId);
        p.add(txtNombre);
        p.add(txtPrecio);

        return p;
    }

    private JScrollPane crearPanelTabla() {
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        return new JScrollPane(tabla);
    }

    private JPanel crearPanelBotones() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        p.add(btnInsertar);
        p.add(btnActualizar);
        p.add(btnEliminar);
        p.add(btnBuscar);
        p.add(btnListar);
        p.add(btnLimpiar);
        return p;
    }

    // =========================
    // EVENTOS
    // =========================
    private void configurarEventos() {

        // Seleccionar fila -> cargar en formulario
        tabla.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && tabla.getSelectedRow() != -1) {
                int fila = tabla.getSelectedRow();
                txtId.setText(String.valueOf(modelo.getValueAt(fila, 0)));
                txtNombre.setText(String.valueOf(modelo.getValueAt(fila, 1)));
                Object precio = modelo.getValueAt(fila, 2);
                txtPrecio.setText(precio == null ? "" : String.valueOf(precio));
            }
        });

        // Insertar
        btnInsertar.addActionListener(e -> {
            if (!validarCampos(true, true)) return;

            int id = Integer.parseInt(txtId.getText().trim());
            String nombre = txtNombre.getText().trim();
            String precio = txtPrecio.getText().trim();
            if (precio.isEmpty()) precio = null; // permitir NULL

            boolean ok = insertar(id, nombre, precio);
            if (ok) {
                JOptionPane.showMessageDialog(this, "Insertado correctamente.");
                cargarTabla();
                limpiar();
            }
        });

        // Actualizar
        btnActualizar.addActionListener(e -> {
            if (!validarCampos(true, true)) return;

            int id = Integer.parseInt(txtId.getText().trim());
            String nombre = txtNombre.getText().trim();
            String precio = txtPrecio.getText().trim();
            if (precio.isEmpty()) precio = null;

            boolean ok = actualizar(id, nombre, precio);
            if (ok) {
                JOptionPane.showMessageDialog(this, "Actualizado correctamente.");
                cargarTabla();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar (¿existe ese ID?).");
            }
        });

        // Eliminar
        btnEliminar.addActionListener(e -> {
            String idTxt = txtId.getText().trim();
            if (idTxt.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Selecciona una fila o escribe un ID para eliminar.");
                return;
            }
            int id;
            try {
                id = Integer.parseInt(idTxt);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "ID inválido.");
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(
                    this, "¿Eliminar el cliente con ID " + id + "?", "Confirmar",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm != JOptionPane.YES_OPTION) return;

            boolean ok = eliminar(id);
            if (ok) {
                JOptionPane.showMessageDialog(this, "Eliminado.");
                cargarTabla();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar (¿existe ese ID?).");
            }
        });

        // Buscar por ID
        btnBuscar.addActionListener(e -> {
            String idTxt = JOptionPane.showInputDialog(this, "Introduce el ID a buscar:");
            if (idTxt == null) return; // cancel
            idTxt = idTxt.trim();
            if (idTxt.isEmpty()) return;

            int id;
            try {
                id = Integer.parseInt(idTxt);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "ID inválido.");
                return;
            }

            String[] fila = buscarPorId(id);
            if (fila == null) {
                JOptionPane.showMessageDialog(this, "No encontrado.");
            } else {
                txtId.setText(fila[0]);
                txtNombre.setText(fila[1]);
                txtPrecio.setText(fila[2] == null ? "" : fila[2]);
            }
        });

        // Listar
        btnListar.addActionListener(e -> cargarTabla());

        // Limpiar
        btnLimpiar.addActionListener(e -> limpiar());
    }

    // =========================
    // VALIDACIÓN
    // =========================
    /**
     * @param requiereId   si ID es obligatorio
     * @param exigeNombrePrecio si NIF y Nombre son obligatorios
     */
    private boolean validarCampos(boolean requiereId, boolean exigeNombrePrecio) {
        String idTxt = txtId.getText().trim();
        String nombre = txtNombre.getText().trim();
        String precio = txtPrecio.getText().trim();

        if (requiereId) {
            if (idTxt.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El ID es obligatorio (no autonumérico).");
                return false;
            }
            try {
                Integer.parseInt(idTxt);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El ID debe ser un número entero.");
                return false;
            }
        }

        if (exigeNombrePrecio) {
            if (precio.isEmpty() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nombre y Precio son obligatorios.");
                return false;
            }
        }

        // Longitudes según tabla
        if (nombre.length() > 30) {
            JOptionPane.showMessageDialog(this, "Nombre demasiado largo (máx 60).");
            return false;
        }

        // precio es VARCHAR(10) y puede ser NULL
        if (!precio.isEmpty() && precio.length() > 10) {
            JOptionPane.showMessageDialog(this, "PRecio demasiado largo. Max.10");
            return false;
        }

        return true;
    }

    // =========================
    // CARGAR / LIMPIAR
    // =========================
    private void cargarTabla() {
        modelo.setRowCount(0);
        List<String[]> lista = listarTodos();
        for (String[] fila : lista) {
            modelo.addRow(fila);
        }
    }

    private void limpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        tabla.clearSelection();
    }

    // =========================
    // CONEXIÓN
    // =========================
    private static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // =========================
    // DAO (CRUD)
    // =========================
    private boolean insertar(int id, String nombre, String precioNullable) {
        String sql = "INSERT INTO " + DB_NAME + "." + TABLE + " (id, nombre, precio) VALUES (?, ?, ?)";
        try (Connection cn = getConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, precioNullable);

            if (precioNullable == null) ps.setNull(4, Types.VARCHAR);
            else ps.setString(3, precioNullable);

            return ps.executeUpdate() == 1;

        } catch (SQLException e) {
            mostrarErrorSQL("INSERTAR", e);
            return false;
        }
    }

    private boolean actualizar(int id, String nombre, String precioNullable) {
        String sql = "UPDATE " + DB_NAME + "." + TABLE + " SET nombre=?, precio=? WHERE id=?";
        try (Connection cn = getConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setString(2, precioNullable);

            if (precioNullable == null) ps.setNull(2, Types.VARCHAR);
            else ps.setString(2, precioNullable);

            ps.setInt(3, id);

            return ps.executeUpdate() == 1;

        } catch (SQLException e) {
            mostrarErrorSQL("ACTUALIZAR", e);
            return false;
        }
    }

    private boolean eliminar(int id) {
        String sql = "DELETE FROM " + DB_NAME + "." + TABLE + " WHERE id=?";
        try (Connection cn = getConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() == 1;

        } catch (SQLException e) {
            mostrarErrorSQL("ELIMINAR", e);
            return false;
        }
    }

    private String[] buscarPorId(int id) {
        String sql = "SELECT id, nombre, precio FROM " + DB_NAME + "." + TABLE + " WHERE id=?";
        try (Connection cn = getConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new String[] {
                            String.valueOf(rs.getInt("id")),
                            rs.getString("nombre"),
                            rs.getString("precio") // puede venir null
                    };
                }
            }

        } catch (SQLException e) {
            mostrarErrorSQL("BUSCAR", e);
        }
        return null;
    }

    private List<String[]> listarTodos() {
        String sql = "SELECT id, nombre, precio FROM " + DB_NAME + "." + TABLE + " ORDER BY id";
        List<String[]> lista = new ArrayList<>();

        try (Connection cn = getConexion();
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new String[] {
                        String.valueOf(rs.getInt("id")),
                        rs.getString("nombre"),
                        rs.getString("precio")// puede venir null
                });
            }

        } catch (SQLException e) {
            mostrarErrorSQL("LISTAR", e);
        }

        return lista;
    }

    // =========================
    // ERRORES SQL (para que no vuelva a engañar con “ID repetido”)
    // =========================


    private void mostrarErrorSQL(String operacion, SQLException e) {
        String msg = "Error SQL al " + operacion + "\n\n"
                + "SQLState: " + e.getSQLState() + "\n"
                + "ErrorCode: " + e.getErrorCode() + "\n"
                + "Mensaje: " + e.getMessage();

        // Por consola (debug)
        e.printStackTrace();

        // Por pantalla
        JOptionPane.showMessageDialog(this, msg, "Error SQL", JOptionPane.ERROR_MESSAGE);
    }
}