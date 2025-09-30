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
public class Comparacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int l = teclado.nextInt();
        int a = 0;
        
        int [] a1 = new int [l];
        int [] a2 = new int [l];
        
        for(int i = 0; i < a1.length; i++){
            a1[i] = teclado.nextInt();
        }
        
        for(int i = 0; i < a2.length; i++){
            a2[i] = teclado.nextInt();
        }
        
        for(int i = 0; i < a1.length; i++){
            if (a1[i]>a2[i]){
                    a++;
            }
        }
        
        if(a>=l){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
