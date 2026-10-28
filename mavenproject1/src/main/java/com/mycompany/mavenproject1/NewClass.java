/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author renediazoleta
 */
public class NewClass {
      public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);

            int i; 
            int suma = 0;
            
            do{ 
                System.out.println("Ingresa un numero entero, entre el 1 y 20");
                i = leer.nextInt();
            }while(i < 0 || i > 20);
            
              for(int j = 1; j <= i; j++){
                  suma = suma + j;
                  System.out.println(j);
                  
              }
              System.out.println(suma);
             
    }
}
