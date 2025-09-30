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
public class CuadroSemiMagico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // tamaño de la matriz
        int[][] m = new int[n][n];

        // Leer matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        // Tomamos la suma de la primera fila como referencia
        int sumaRef = 0;
        for (int j = 0; j < n; j++) {
            sumaRef += m[0][j];
        }

        boolean esSemiMagico = true;

        // Verificar filas
        for (int i = 0; i < n && esSemiMagico; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += m[i][j];
            }
            if (sumaFila != sumaRef) {
                esSemiMagico = false;
            }
        }

        // Verificar columnas
        for (int j = 0; j < n && esSemiMagico; j++) {
            int sumaCol = 0;
            for (int i = 0; i < n; i++) {
                sumaCol += m[i][j];
            }
            if (sumaCol != sumaRef) {
                esSemiMagico = false;
            }
        }

        // Verificar diagonal principal
        int sumaDiag1 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag1 += m[i][i];
        }
        if (sumaDiag1 != sumaRef) {
            esSemiMagico = false;
        }

        // Verificar diagonal secundaria
        int sumaDiag2 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag2 += m[i][n - 1 - i];
        }
        if (sumaDiag2 != sumaRef) {
            esSemiMagico = false;
        }

        // Salida
        System.out.println(esSemiMagico ? 1 : 0);
    }
}
