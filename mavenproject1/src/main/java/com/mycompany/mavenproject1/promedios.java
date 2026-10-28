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
public class promedios {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int cali = 0;
         int suma = 0;
         int apro = 0;
         System.out.println("ingresa las calificaciones");
         for(int i = 0; i < 5; i++){
             
             do{ 
                cali = leer.nextInt();
                if(cali < 0 || cali > 100){
                    System.out.println("La calificacion ingresada es incorrecta");
                }
                if(cali > 70){
                    System.out.println("alumno aprobado");
                    apro = apro + 1;
                }
             }while((cali < 0 || cali > 100));
             
             suma = suma + cali;
            
         }
             System.out.println("Promedio es: " + suma / 5 );
             System.out.println("Numero de aprobados; " + apro);
             
             
    }
}
