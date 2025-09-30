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
public class CuadroMagico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int sumaF = 0;
        int sumaC = 0;
        int sumaD1 = 0;
        int sumaD2 = 0;
        
        int [][] c = new int [3][3];
        
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c.length; j++){
                c[i][j] = teclado.nextInt();
            }
        }
        
        for(int i = 0; i < 3; i++){
            sumaF += c[i][0] + c[i][1] + c[i][2];
        }
        
        for(int j = 0; j < 3; j++){
            sumaC += c[0][j] + c[1][j] + c[0][j];
        }
        
        for(int k = 0; k < 3; k++){
            sumaD1 += c[k][k];
        }
        
        for(int l = 0; l < 3; l++){
            sumaD2 += c[l][2-l];
        }
        
        if(sumaD1==sumaD2&&(sumaC/3)==(sumaF/3)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
