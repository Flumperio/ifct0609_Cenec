package Condicionales;

import java.util.Random;
import java.util.Scanner;

public class Reto_Piedra_Papel_Tijera {
    public static void main(String[] args) {
        // Definición de variables
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int partidasGanadas = 0, partidasPerdidas = 0, partidasEmpate = 0;

        System.out.print("\033[H\033[2J"); // Limpiar pantalla
        System.out.println("Quieres jugar a Piedra/Papel/Tijera?");

        while (true) {
            System.out.print("\n1.-Jugar --- 2.-Salir: ");
            int jugar = teclado.nextInt();

            if (jugar == 2) {
                System.out.println("Saliendo...");
                break;
            }
            if (jugar == 1) {
                System.out.print("Introduce (1.- Piedra, 2.- Papel, 3.- Tijera): ");
                int entradaUsuario = teclado.nextInt();

                if (entradaUsuario >= 1 && entradaUsuario <= 3) {
                    int entradaMaquina = random.nextInt(3) + 1; // 1,2,3

                    if (entradaUsuario == entradaMaquina) {
                        System.out.println("Empate");
                        partidasEmpate++;
                    } else {
                        if ((entradaUsuario == 1 && entradaMaquina == 3) ||
                                (entradaUsuario == 2 && entradaMaquina == 1) ||
                                (entradaUsuario == 3 && entradaMaquina == 2)) {
                            System.out.println("Ganas");
                            partidasGanadas++;
                        } else {
                            System.out.println("Pierdes");
                            partidasPerdidas++;
                        }
                    }
                    System.out.println("Elegiste: " + entradaUsuario + " la máquina eligió: " + entradaMaquina);
                } else {
                    System.out.println("Opcion Invalida");
                }
            } else {
                System.out.println("Opcion invalida");
            }
        }
        int totalPartidas = partidasEmpate + partidasGanadas + partidasPerdidas;
        System.out.println("\n=== === === Resultado === === ===");
        System.out.println("Jugaste un total de " + totalPartidas + " partidas:");
        System.out.println("Ganaste: " + partidasGanadas);
        System.out.println("Perdiste: " + partidasPerdidas);
        System.out.println("Empataste: " + partidasEmpate);
        teclado.close();
    }
}

