/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_7_operaciones;

/**
 *
 * @author bisonte
 */
public class EVA_1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EL TIPO DE DATO DETERMINA LAS OPERACIONES
        //ENTEROS, REALES, CADENAS, LOGICOS, ETC
        //EXPRESIÓN:
        //VALORES
        //VARIABLES
        //OPERADORES
        //FUNCIONES
        //QUE SE EVALUAN PARA OBTENER UN RESULTADO
        //OPERACIONES CON NÚMEROS:
        //ARITMÉTICAS:
        int suma, val1, val2; //declaro 3 variables del mismo tipo
        //ASIGNACION: PONER UN VALOR EN UNA VARIABLE
        //operador --> símbolo que trabaja SOBRE identificadores.
        // = --> asignacion --> poner el valor
        // == --> comparación
        val1 = 100; //asignar el valor de 100 a la variable val1
        val2 = 50;
        suma = val1 + val2; //expresión, asignar a la variable suma la operacion entre val1 y val2
        // + --> esta entre dos enteros, se interpreta como lo que los debe sumar
        System.out.print("val1 = ");
        System.out.println(val1);
        System.out.print("val2 = ");
        System.out.println(val2);
        System.out.print("suma = ");
        System.out.println(suma);
        //OPERACIONES RESPETAN REGLAS MATEMÁTICAS
        //MULTIPLICACION
        // *
        int multi;
        multi = val1 + val2;
        System.out.print("Multiplicacion = ");
        System.out.println(multi);
        // / --> operador de division
        int div;
        div = val1 / val2;
        System.out.print("Division = ");
        System.out.println(div);
        val1 = 10;
        val2 = 3;
        div = val1 / val2;
        System.out.print("val1 = ");
        System.out.println(val1);
        System.out.print("val2 = ");
        System.out.println(val2);
        System.out.print("Division = ");
        System.out.println(div);
        double resu;
        resu = val1 / val2;
        System.out.print("Resu = ");
        System.out.println(resu);
        double val2copia;
        val2copia = 3;
        resu = val1 / val2copia;
        System.out.print("Resu = ");
        System.out.println(resu);
    }
    
}
