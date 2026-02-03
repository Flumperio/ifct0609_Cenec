package Condicionales;

import java.util.Scanner;
import java.util.Random;

public class Reto_Dados {
        public static void main(String[] args) {
            // Definición de variables
            Scanner teclado = new Scanner(System.in);
            Random random = new Random();
            int partidasGanadas = 0, partidasPerdidas = 0, partidasEmpate = 0;

            System.out.print("\033[H\033[2J"); // Limpiar pantalla
            System.out.println("Quieres jugar a Dados?");

            while (true) {
                System.out.print("\n1.-Jugar --- 2.-Salir: ");
                int jugar = teclado.nextInt();

                if (jugar == 2) {
                    System.out.println("Saliendo...");
                    break;
                }
                if (jugar == 1) {
                    System.out.print("Introduce tu dado (1-6): ");
                    int dadoUsuario = teclado.nextInt();

                    if (dadoUsuario >= 1 && dadoUsuario <= 6) {
                        int dadoMaquina = random.nextInt(6) + 1; // 1-6

                        if (dadoUsuario == dadoMaquina) {
                            System.out.println("Empate");
                            partidasEmpate++;
                        } else if (dadoUsuario > dadoMaquina) {
                            System.out.println("Ganas");
                            partidasGanadas++;
                        } else {
                            System.out.println("Pierdes");
                            partidasPerdidas++;
                        }
                        System.out.println("Tu dado: " + dadoUsuario + " dado máquina: " + dadoMaquina);
                    } else {
                        System.out.println("Opcion Invalida (1-6)");
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

