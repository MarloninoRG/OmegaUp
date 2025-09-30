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
public class Mediana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int l = teclado.nextInt();
        int mediana;
        int [] n = new int [l];
        int [] n2 = new int [l];
        
        for(int i = 0; i < l; i++){
            n[i] = teclado.nextInt();
        }
        
        for(int i = 0; i < l; i++){
            n2[i] = n[i];
        }
        
        Arrays.sort(n);
        
        if(l%2!=0){
            mediana = (n[(l-1)/2] + n[l/2]) / 2;
        }else{
            mediana = n[l/2];
        }
       
        System.out.println(mediana);
        
        for(int i = 0; i < l; i++){
            if(n2[i]==mediana){
                System.out.println(i);
            }
        }
    }    
}
