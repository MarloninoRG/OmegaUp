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
public class CuanVecAp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int l = teclado.nextInt();
        int c = 0;
        
        int [] a = new int [l];
        
        for(int i = 0; i < a.length; i++) {
            a[i] = teclado.nextInt();
        }
        
        int w = teclado.nextInt();
        
        for(int i = 0; i < a.length; i++) {
            if (a[i]==w){
                c++;
            }
        }
        
        System.out.println(c);
    }
}
