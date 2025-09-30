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
public class DivisionFac {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        
        if (b>a){
            return;
        }
        
        int div = factorial(a)/factorial(b);
        
        System.out.println(div);
        
    }
    
    public static int factorial (int a){
        int f = 1;
        while(a>1){
            f *= a;
            a--;
        }
        return f;
    }
}
