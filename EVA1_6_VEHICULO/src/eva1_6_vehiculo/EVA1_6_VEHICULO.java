/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marca;
        String modelo;
        int year;
        String color;
        int km;
        double precio;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Marca del vehiculo:");
        marca = captu.nextLine();
        System.out.println("Modelo del vehiculo:");
        modelo = captu.nextLine();
        System.out.println("Year del vehiculo:");
        year = captu.nextInt();
        color = captu.nextLine();
        System.out.println("Color del vehiculo:");
        color = captu.nextLine();
        System.out.println("Kilometraje del vehiculo:");
        km = captu.nextInt();
        System.out.println("Precio del vehiculo:");
        precio = captu.nextDouble();
        
        System.out.println("DATOS CAPTURADOS");
        System.out.print("Marca: ");
        System.out.println(marca);
        System.out.print("Modelo: ");
        System.out.println(modelo);
        System.out.print("Año: ");
        System.out.println(year);
        System.out.print("Color: ");
        System.out.println(color);
        System.out.print("Kilometraje: ");
        System.out.println(km);
        System.out.print("Precio: $");
        System.out.println(precio);
    }
    
}
