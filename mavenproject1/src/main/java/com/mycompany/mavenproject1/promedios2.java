/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author renediazoleta
 */
import java.util.Scanner;
public class promedios2 {
    public static void main(String[] args) {
        int n = 0;
        int suma = 0;
          
        System.out.println("ingresa el valor de N");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] cali = new int[n];
        for(int i = 0; i < cali.length; i++){
           
            do{
            System.out.println("ingresa las calificaciones");
            cali[i] = sc.nextInt();
            if(cali[i] < 0 || cali[i] > 100){
                System.out.println("ingresa una calificacion valida");
            }
            
            }while(cali[i] > 100 || cali[i] < 0);
            if(cali[i] >= 70){
               
               System.out.println("Aprobado");
            
            suma = suma + cali[i];
            System.out.println("Promedio es: " + suma / n);
            
            
            }
        }
        for(int i = 0; i < cali.length; i++){
                System.out.println(cali[i]);
            }
     
      
    }
}
