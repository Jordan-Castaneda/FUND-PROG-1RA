/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_temperatura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_10_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp, far, kelvin;//variables (identificadores validos)
        Scanner captu = new Scanner(System.in);
        //SOLICITAR LOS DATOS AL USUARIO
        System.out.println("Introduce la temperatura en centigrados:");
        temp = captu.nextDouble();
        //HACER CALCULO
        far = (temp * 1.8) + 32;//grados farenheit
        kelvin = temp + 273.15;//kelvin
        //MOSTRAR RESULTADOS AL USUARIO
        System.out.println(temp + "°C =" + far + "°F");
        System.out.println(temp + "°C = " + kelvin + "°K");
    }
    
}
