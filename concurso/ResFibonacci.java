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
public class ResFibonacci {
    static final int MOD = 2017;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long n = teclado.nextLong();

        if (n < 1 || n > (1L << 31)) {
            return;
        }

        int r = fibonacci(n);
        System.out.println(r);
    }

    // Calcula F(n) % MOD con matriz y exponenciación rápida
    public static int fibonacci(long n) {
        if (n == 1 || n == 2) return 1;

        int[][] base = {{1, 1}, {1, 0}};
        int[][] result = matrixPower(base, n - 1);

        return result[0][0]; // F(n) está aquí
    }

    // Eleva matriz a la potencia exp usando exponenciación rápida
    private static int[][] matrixPower(int[][] m, long exp) {
        int[][] result = {{1, 0}, {0, 1}}; // matriz identidad
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = multiply(result, m);
            }
            m = multiply(m, m);
            exp >>= 1;
        }
        return result;
    }

    // Multiplicación de matrices 2x2 con módulo
    private static int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        c[0][0] = (int) (((long)a[0][0] * b[0][0] + (long)a[0][1] * b[1][0]) % MOD);
        c[0][1] = (int) (((long)a[0][0] * b[0][1] + (long)a[0][1] * b[1][1]) % MOD);
        c[1][0] = (int) (((long)a[1][0] * b[0][0] + (long)a[1][1] * b[1][0]) % MOD);
        c[1][1] = (int) (((long)a[1][0] * b[0][1] + (long)a[1][1] * b[1][1]) % MOD);
        return c;
    }
}
