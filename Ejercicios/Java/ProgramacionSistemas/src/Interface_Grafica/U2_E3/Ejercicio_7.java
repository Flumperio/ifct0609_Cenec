package Interface_Grafica.U2_E3;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_7 {
    public static void main (){
        SwingUtilities.invokeLater(() -> new Ventana_Bordeer("Ejercicio 5", 450, 300));
    }

    static class Ventana_Bordeer extends JFrame {
        private CardLayout cardLayout;

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
            JPanel panel_1 = new JPanel();
            panel_1.add(new JLabel("Primer Panel"));
            cardsPanel.add(panel_1,"1");
            //Segundo Card
            JPanel panel_2 = new JPanel();
            panel_2.add(new JLabel("Segundo Panel"));
            cardsPanel.add(panel_2,"1");
            //Tercer Card
            JPanel panel_3 = new JPanel();
            panel_3.add(new JLabel("Tercer Panel"));
            cardsPanel.add(panel_3,"1");
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
