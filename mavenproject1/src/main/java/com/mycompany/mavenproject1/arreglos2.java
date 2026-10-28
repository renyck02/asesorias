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
public class arreglos2 {
    public static void main(String[] args) {
        int numeros[] = {0,1,2,3,4,5,6,7,8,9};
        int [] numeros2 = new int [5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numeros2.length; i++){
            System.out.println("Ingresa un numero");
            numeros2[i] = sc.nextInt();
        }
        for(int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        
    }
}
