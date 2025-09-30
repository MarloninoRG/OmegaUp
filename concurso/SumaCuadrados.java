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
public class SumaCuadrados {
    static int contarFormas(int n, int k) {
        return backtrack(n, k, 1, 0, 0);
    }

    static int backtrack(int objetivo, int cantidad, int inicio, int sumaActual, int usados) {
        if (usados == cantidad) {
            return sumaActual == objetivo ? 1 : 0;
        }
        if (sumaActual > objetivo || usados > cantidad) {
            return 0;
        }

        int formas = 0;
        for (int i = inicio; i * i + sumaActual <= objetivo; i++) {
            formas += backtrack(objetivo, cantidad, i, sumaActual + i * i, usados + 1);
        }
        return formas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // número objetivo
        int k = sc.nextInt(); // cantidad de sumandos
        System.out.println(contarFormas(n, k));
    }
}

