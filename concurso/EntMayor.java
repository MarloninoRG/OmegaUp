/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurso;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Marlon Rojas Galindo
 */
public class EntMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int l = teclado.nextInt();
        int [] n = new int [l];
        int s = 0;
        
        for(int i = 0; i < n.length; i++) {
            n[i] = teclado.nextInt();
        }
        
        int [] n2 = new int [n.length];
        
        for(int i = 0; i < n2.length; i++){
            n2[i] = n[i];
        }
        
        Arrays.sort(n2);
        
        int c = n2[n2.length-1];
        
        for(int i = 0; i < n.length; i++){
            if (n[i]!=c){
                s++;
            }
        }
        System.out.println(s);
        for(int i = 0; i < n.length; i++){
            if (n[i]!=c){
                System.out.println(n[i]);
            }
        }
    }
}
