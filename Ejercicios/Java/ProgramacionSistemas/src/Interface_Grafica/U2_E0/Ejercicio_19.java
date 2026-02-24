package Interface_Grafica.U2_E0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio_19 {
    private JFrame frame;

    public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ejercicio_19 window = new Ejercicio_19();
                    window.frame.setVisible(true);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
    public Ejercicio_19(){
        initialize();
    }

    //SubClases
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblMensaje = new JLabel("¡Hola, WindowBuilder!");
        lblMensaje.setBounds(160, 50, 200, 30);
        frame.getContentPane().add(lblMensaje);

        JButton btnSaludo = new JButton("Haz clic");
        btnSaludo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText("¡Botón presionado!");
            }
        });

        btnSaludo.setBounds(160, 100, 120, 30);
        frame.getContentPane().add(btnSaludo);
    }
}



