/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formula_general;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_14_FORMULA_GENERAL {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR
        double A, B, C, x1, x2;
        Scanner captu = new Scanner(System.in);
        //CAPTURAR
        System.out.println("Valor de A:");
        A = captu.nextDouble();
        System.out.println("Valor de B:");
        B = captu.nextDouble();
        System.out.println("Valor de C:");
        C = captu.nextDouble();
        //CALCULAR
        x1 = (-1 * B + Math.sqrt((B * B) - (4 * A * C))) / (2 * A);
        x2 = (-1 * B - Math.sqrt((B * B) - (4 * A * C))) / (2 * A);
        
        //MOSTRAR RESULTADOS
        System.out.println("Raiz 1 = " + x1);
        System.out.println("Raiz 2 = " + x2);
    }
    
}
