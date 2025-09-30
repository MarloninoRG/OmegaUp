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
public class Rec1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();
        
        int r = formula(n);
        
        System.out.println(r);
    }
    
    public static int formula(int n){
        if (n<=5){
            return 1;
        }
        
        return formula(n-2)*5;
    }
}
