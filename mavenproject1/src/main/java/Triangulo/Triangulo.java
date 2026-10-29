/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulo;

/**
 *
 * @author renediazoleta
 */
import java.util.Scanner;
public class Triangulo {
    public static void main(String[]args){
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa una cantidad");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
               
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        
    }       
}
