/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurso;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Marlon Rojas Galindo
 */
public class CadenaPerfecta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palabra = teclado.nextLine();
        char[] p = palabra.toCharArray();

        Arrays.sort(p); // Ordenar caracteres alfabéticamente

        StringBuilder resultado = new StringBuilder();

        int c = 0;
        while (c < p.length) {
            char actual = p[c];
            int contador = 0;

            // Contar cuántas veces aparece el carácter actual
            while (c < p.length && p[c] == actual) {
                contador++;
                c++;
            }

            resultado.append(contador).append(actual);
        }

        System.out.println(resultado.toString());
    }
}

