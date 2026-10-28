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
public class arreglos1 {
    public static void main(String[] args) {
        
        /*
        
        TipoDeDato NombreVariable = { DATO1, DATO2, DATO3, ... , etc};
         POSICIONES                     0       1       2   ...   n 
        
        TipoDeDato[] NombreVariable = new TIPODATO[Longitud];
        
        */
        int numeros[] = {0,1,2,3,4,5,6,7,8,9}; // arreglo con valores definidos
        int[] numeros2 = new int[5]; // arreglo sin valores asignados todavia
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < numeros2.length; i++){
            System.out.println("ingresa un numero");
            numeros2[i] = sc.nextInt();
        }
        for(int i = 0; i < numeros2.length; i++){
  
            System.out.println(numeros2[i]);
        }
    }
}
