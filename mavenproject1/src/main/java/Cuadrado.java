/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renediazoleta
 */
import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa una cantidad");
        i = sc.nextInt();
        
        for (int n = 1; n <= i; n++) {

            for (int j = 1; j <= i; j++) {
                if (n == i || n == 1 || j == 1 || j == i){
                    System.out.print(" * ");

                }
                else{

                    System.out.print("   ");
                }
           
            }
        System.out.println(" ");
        }
        
    }
}
