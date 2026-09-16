/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_TEMPERATURA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp, celsius, kelvin;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la temperatura en Farenheit:");
        temp = captu.nextDouble();
        
        celsius = (temp - 32) / 1.8;//AQUI SI IMPORTA EL PARÉNTESIS
        kelvin = (temp - 32) * (5 / 9.0) + 273.15;//OJO: 5 / 9 da CERO, 5 / 9.0 DA 0.5
        
        System.out.println(temp + "°F = " + celsius + "°C");
        System.out.println(temp + "°F = " + kelvin + "°K");
    }
    
}
