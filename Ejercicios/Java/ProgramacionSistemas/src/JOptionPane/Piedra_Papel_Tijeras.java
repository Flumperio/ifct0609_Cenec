package JOptionPane;

import javax.swing.*;
import java.util.Random;


public class Piedra_Papel_Tijeras {
    public static void main(String[] args) {
        //Variables
        int input1, input2, iMach = 0;
        String [] arrMachine = {"Piedra", "Papel", "Tijera"};
        Random random = new Random();
        int pGan = 0, pPer = 0, pEmp = 0;

        while (true) {

            input2 = JOptionPane.showConfirmDialog(null, "Jugamos a Piedra, Papel, Tijera?", "Juego P.P.T.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (input2 == 1){
                JOptionPane.showMessageDialog(null, "Hasta luego Piruleta...");
                if (pEmp != 0 || pGan != 0 || pPer != 0)
                    JOptionPane.showMessageDialog(null, "Numero partidas jugadas: " + (pEmp+pGan+pPer) +
                            "\nPartidas ganadas: " + pGan + "\nPartidas perdidas: " + pPer + "\nPartidas empate: " + pEmp);
                break;
            } else {
                input1 = JOptionPane.showOptionDialog(null, "Selecciona una: ", " a Jugar.", 0, 3, null, arrMachine, null);
                iMach = random.nextInt(3);
                if (input1 == iMach){
                    JOptionPane.showMessageDialog(null, "Yo tiré: "+arrMachine[iMach]+"\n\n *** Empate ***");
                    pEmp += 1;
                } else {
                    if ((input1 == 0 && iMach == 2) ||
                            (input1 == 1 && iMach == 0) ||
                            (input1 == 2 && iMach == 1)) {
                        JOptionPane.showMessageDialog(null, "Yo tiré: "+arrMachine[iMach]+"\n\n *** Ganas ***");
                        pGan++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Yo tiré: "+arrMachine[iMach]+"\n\n *** Pierdes ***");

                        pPer++;
                    }
                }
            }
        }
    }
}

