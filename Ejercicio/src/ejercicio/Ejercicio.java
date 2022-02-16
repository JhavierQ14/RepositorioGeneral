/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author Jhavi
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scaner = new Scanner(System.in);
		
		System.out.println("Escribe un número:");
		
		double numero = scaner.nextDouble();
		
		if (numero < 0) {
			System.out.println("El número es negativo");

		} else {
			System.out.println("El número es positivo");
		}
    }
    
}
