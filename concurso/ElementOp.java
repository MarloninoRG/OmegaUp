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
public class ElementOp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int l = teclado.nextInt();
        
        if (l%2==1){
            return;
        }
        
        int [] a1 = new int [l];
        
        for (int i = 0; i < a1.length; i++){
            a1 [i] = teclado.nextInt();
        }
        
        for (int i = 0; i < a1.length/2; i++){
            int j = a1.length - 1 - i;  // El extremo opuesto
            System.out.println(a1[i] + a1[j]);
        }
    }
}
