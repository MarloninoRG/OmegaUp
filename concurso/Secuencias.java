/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package concurso;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Marlon Rojas Galindo
 */
public class Secuencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();
        
        if(n < 1 || n > 20){
            return;
        }
        
        int [] s = new int [n];
        
        for(int i = 0; i < n; i++){
            s[i] = teclado.nextInt();
            if (s[i] < 0 || s[i] > 9){
                return;
            }
        }
        
        s = funcion(s, n);
        
        for(int j = 0; j < n; j++){
            System.out.print(s[j]+" ");
        }
    }
    
    public static int[] funcion(int[] s, int n) {
        
        if(n<=2){
            return quitarUltimo(s);
        }
        
        if (s[0] % 2 == 0) {
            ordenarExceptoUltimo(s);
            
        } else if (s[n - 2] % 2 == 0) {
            invertirExceptoUltimo(s);
        }
        
        int [] m = quitarUltimo(s);
        funcion(m, n-1);
        return m;
    }
    
    public static void ordenarExceptoUltimo(int[] arr) {
        // Creamos un subarreglo con todos excepto el último elemento
        int[] sub = Arrays.copyOfRange(arr, 0, arr.length - 1);

        // Ordenamos el subarreglo
        Arrays.sort(sub);

        // Copiamos el subarreglo ordenado de vuelta al original
        System.arraycopy(sub, 0, arr, 0, sub.length);

        // El último elemento queda igual
    }
    
     public static void invertirExceptoUltimo(int[] arr) {
        int n = arr.length - 1; // Ignorar el último
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
     public static int[] quitarUltimo(int[] arr) {
        // Crear nuevo arreglo con tamaño uno menos
        int[] nuevo = new int[arr.length - 1];

        // Copiar todos excepto el último elemento
        System.arraycopy(arr, 0, nuevo, 0, arr.length - 1);

        return nuevo;
    }

}
