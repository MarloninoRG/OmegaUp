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
public class SumArr {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int l = teclado.nextInt();
        
        int [] a = new int [l];
        
        int suma = 0;
        
        for(int i = 0; i < l; i++){
            a[i] = teclado.nextInt();
        }
        
        for(int b: a){
            suma += b;
        }
        
        System.out.println(suma);
    }
}
