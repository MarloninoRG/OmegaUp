/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurso;
import java.util.Scanner;
/**
 *
 * @author Marlon Rojas Galindo
 */
public class Gato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tablero = new char[3][3];

        // Leer el tablero
        for (int i = 0; i < 3; i++) {
            String fila = sc.nextLine().trim();
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = fila.charAt(j);
            }
        }

        // Revisar ganador
        if (gana(tablero, 'x')) {
            System.out.println("Roots!:D");
        } else if (gana(tablero, 'o')) {
            System.out.println("Velafloow 8)");
        } else {
            System.out.println("Bailo Verta :S");
        }
    }

    // Función para verificar si un jugador gana
    public static boolean gana(char[][] t, char p) {
        // Filas
        for (int i = 0; i < 3; i++) {
            if (t[i][0] == p && t[i][1] == p && t[i][2] == p) return true;
        }
        // Columnas
        for (int j = 0; j < 3; j++) {
            if (t[0][j] == p && t[1][j] == p && t[2][j] == p) return true;
        }
        // Diagonales
        if (t[0][0] == p && t[1][1] == p && t[2][2] == p) return true;
        if (t[0][2] == p && t[1][1] == p && t[2][0] == p) return true;

        return false;
    }
}

