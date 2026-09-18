/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temperatura_3;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_12_TEMPERATURA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp, celsius, far;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la temperatura en Kelvin:");
        temp = captu.nextDouble();
        
        celsius = temp - 273.15;
        far = temp * 9 / 5.0 - 459.67;
        
        System.out.println(temp + "°K = " + celsius + "°C");
        System.out.println(temp + "°K = " + far + "°F");
    }
    
}
