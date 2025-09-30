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
public class Tesoro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int [][] m = new int [3][3];
        boolean ig = true;
        
        for(int i = 0;i < 3; i++){
            for(int j = 0; j < 3; j++){
                m[i][j]=teclado.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            if (m[i][i] != m[i][2 - i]) {
                ig = false;
                break;
            }
        }
        
        if (ig){
            System.out.println("Tesoro encontrado");
        } else{
            System.out.println("Sigue buscando");
        }
    }
}
