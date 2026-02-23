package Interface_Grafica.U2_E3;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_8 {
    public static void main (){
        SwingUtilities.invokeLater(() -> new Ventana_Bordeer("Ejercicio 5", 450, 300));
        System.out.println("Se está ejecutando");
    }

    static class Ventana_Bordeer extends JFrame {
        //Definimos las variables globales para interactuar con ellas en el futuro;
        private CardLayout cardLayout;
        private JCheckBox checkBox, checkBox2;

        public Ventana_Bordeer(String nombre, int alto, int ancho) {
            super(nombre);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(ancho, alto);
            setLocationRelativeTo(null);
            setLayout(new BorderLayout());
            //Añadimos layout
               // ← Cards en CENTER con CardLayout
            JPanel cardsPanel = new JPanel(cardLayout = new CardLayout());
            add(cardsPanel, BorderLayout.CENTER); //Ventanas o paginas de ventanas. Son como pestañas.
            //Creamos el primer Card
            JPanel panel_1 = new JPanel(new GridLayout(2,1));
            JLabel titulo = new JLabel("Primer Panel");
            titulo.setHorizontalAlignment(SwingConstants.CENTER);   // ← Centro horizontal
            titulo.setVerticalAlignment(SwingConstants.CENTER);     // ← Centro vertical
            panel_1.add(titulo);
            JPanel gridSub = new JPanel(new GridLayout(2,2));   // ← Subpanel solo números
            gridSub.add(new JLabel("1"));
            gridSub.add(new JLabel("2"));
            gridSub.add(new JLabel("3"));
            gridSub.add(new JLabel("4"));
            panel_1.add(gridSub);
            cardsPanel.add(panel_1,"1");
            //Segundo Card
            JPanel panel_2 = new JPanel();
            panel_2.add(new JLabel("Segundo Panel"));
            checkBox = new JCheckBox("Aceptar términos y condiciones");
            checkBox2 = new JCheckBox("Acepta que estás alelao");
            panel_2.add(checkBox);
            panel_2.add(checkBox2);
            cardsPanel.add(panel_2,"1");
            //Tercer Card

            JPanel grid_3 = new JPanel(new GridLayout(4,1));
            JPanel panel_3 = new JPanel();
            panel_3.add(new JLabel("Tercer Panel"));
            cardsPanel.add(panel_3,"1");
            // hay que meterlo en un grupo, para que al pulsar una opcion no puedas pulsar la otra opcion
            //si desactivamos esta opcion, podremos usar ambos botones
            JRadioButton radioButton1 = new JRadioButton("Opción 1");
            JRadioButton radioButton2 = new JRadioButton("Opción 2");
            JRadioButton radioButton3 = new JRadioButton("Opcion 3");
            ButtonGroup group = new ButtonGroup();
            group.add(radioButton1);
            group.add(radioButton2);
            group.add(radioButton3);


            grid_3.add(cardsPanel);
            grid_3.add(radioButton1);
            grid_3.add(radioButton2);
            grid_3.add(radioButton3);


            panel_3.add(grid_3);

        // hay que meterlo en un grupo, para que al pulsar una opcion no puedas pulsar la otra opcion
        //si desactivamos esta opcion, podremos usar ambos botones.

            //Cuarto Card
            JPanel panel_4 = new JPanel();
            panel_4.add(new JLabel("Cuarto Panel"));
            cardsPanel.add(panel_4,"1");

                        // ← Botones en SOUTH
            JPanel botonesPanel = new JPanel();
            JButton btnPrev = new JButton("Prev");
            JButton btnNext = new JButton("Next");
            botonesPanel.add(btnPrev);
            botonesPanel.add(btnNext);
            add(botonesPanel, BorderLayout.SOUTH);

            // ← Listeners (usa cardsPanel)
            btnNext.addActionListener(e -> cardLayout.next(cardsPanel));
            btnPrev.addActionListener(e -> cardLayout.previous(cardsPanel));
            //Hacemos visible la ventana
            setVisible(true);
        }
    }
}
