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
public class Enteros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();
        int [] a = new int [n];
        
        for(int i = 0; i<a.length; i++) {
            a [i] = teclado.nextInt();
        }
        
        int p = teclado.nextInt();
        
        if(p>0&&p<=1){
            for(int i = 0; i < a.length; i++){
                if(a[i]%2==1){
                    System.out.println(a[i]);
                }
            }
        }else if(p==0){
            for(int i = 0; i < a.length; i++){
                if(a[i]%2==0){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
