package Interface_Grafica.U2_E3;

import javax.swing.*;
import java.awt.*;

public class Reto_Interfaz {
    //Clase Main
    public static void main (){
        SwingUtilities.invokeLater(() -> new Ventana_Reto("Reto _ Ventanas", 550, 500));
    }

    //Subclase Ventana_Reto
    static class Ventana_Reto extends JFrame{
        //Variables Globales de la ventana.
        String [] campos_Personales = {"Nombre:" ,
                "Apellidos: ",
                "Edad:",
                "Dirección:",
                "Teléfono: "};
        String [] Estudios = {"Sin estudios previos", "E.G.B.", "Bachillerato", "Ciclo Superior", "Universitarios", "Doctorado"};
        String [] Situacion = {"Desempleado", "Cuenta Ajena", "Cuenta Propia", "Jubileta"};
        //Constructor
        public Ventana_Reto(String nombre, int alto, int ancho){
            super(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            //Layout Principal
            JPanel panelPrincipal = new JPanel(new GridLayout(13,2,4,8));
            panelPrincipal.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
            setContentPane(panelPrincipal);
            //setLayout(new GridLayout(13,2,4,8));
            //Campos Personales
            for (String campos: campos_Personales){
                add (new JLabel(campos));
                add(new JTextField());
            }
            //Desplegables Estudios y Situación
            panelPrincipal.add(new JLabel("Estudios Previos:"));
            JComboBox<String> option_Estudios = new JComboBox<>(Estudios);
            panelPrincipal.add(option_Estudios);
            panelPrincipal.add(new JLabel("Situación Laboral:"));
            JComboBox<String> option_Situacion = new JComboBox<>(Situacion);
            panelPrincipal.add(option_Situacion);
            //Comentarios
            panelPrincipal.add(new JLabel("Comentarios:"));
            JTextField campo_Comm = new JTextField();
            panelPrincipal.add(campo_Comm);
            //CheckBox's
            JCheckBox chk_1 = new JCheckBox("Java");
            JCheckBox chk_2 = new JCheckBox("Python");
            panelPrincipal.add(chk_1);
            panelPrincipal.add(chk_2);
            //Radio Button,
            JRadioButton radioButton1 = new JRadioButton("Bachillerato");
            JRadioButton radioButton2 = new JRadioButton("Ciclo Medio");
            JRadioButton radioButton3 = new JRadioButton("Ciclo Superior");
            ButtonGroup group = new ButtonGroup();
            group.add(radioButton1);
            group.add(radioButton2);
            group.add(radioButton3);
            panelPrincipal.add(radioButton1);
            panelPrincipal.add(radioButton2);
            panelPrincipal.add(radioButton3);
            //Cargar Curri;
            JButton load_Curri = new JButton("Cargar Curriculum");
            panelPrincipal.add (load_Curri);
            //Linea en blanco
            panelPrincipal.add(new JLabel(""));
            panelPrincipal.add(new JLabel(""));
            //Aceptar y Cerrar
            JButton close_Btn = new JButton("Cerrar");
            JButton accpt_Btn = new JButton("Aceptar");
            panelPrincipal.add (close_Btn);
            panelPrincipal.add (accpt_Btn);

            setVisible(true);
        }
    }
}
