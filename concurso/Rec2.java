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
public class Rec2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        byte n = teclado.nextByte();
        
        if (n < 1 || n > 120){
            return;
        }
        
        formula(n);
    }
    
    public static long formula(byte n){
        if (n<=4){
            System.out.println(1);
            return 1;
        }
        
        long resultado = formula((byte) (n-2))*5;
        System.out.println(resultado);
        
        return resultado;
    }
}
