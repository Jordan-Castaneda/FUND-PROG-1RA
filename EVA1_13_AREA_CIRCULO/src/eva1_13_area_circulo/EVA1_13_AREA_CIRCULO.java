/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_area_circulo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_13_AREA_CIRCULO {
    static final double PI = 3.1416;//CONSTANTE
    static final String MENSAJE = "Radio:";
    
    public static void main(String[] args) {
        //AREA, PERÍMETRO, VOLUMEN
        //PREGUNTAR DATOS, CALCULAR, MOSTRAR RESULTADOS
        double peri, area, vol, radio;
        Scanner captu = new Scanner(System.in);
        System.out.println(MENSAJE);
        radio = captu.nextDouble();
        //MATH ES UNA LIBRERIA DE FUNCIONES MATEMATICAS
        area = Math.pow(radio,2) * Math.PI;
        peri = 2 * Math.PI * radio;
        vol = (4 / 3.0) * Math.PI * (radio*radio*radio);
        
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " +  peri);
        System.out.println("El volumen es: " + vol);
    }
    
}
