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
public class triangulo2 {
    public static void main(String[] args) {
       double saldo = 1000;
       int menu = 0;
       boolean salida = true;
       Scanner sc = new Scanner(System.in);
       
       do{
           
        System.out.println("Bienvenido, eliga que operacion va a realizar(1, 2, 3 o 4");
        menu = sc.nextInt();
        switch (menu){
            case 1:
                System.out.println("Cuanto quiere depositar");
                double deposito = sc.nextDouble();
                if(deposito > 0){
                   saldo = deposito + saldo; 
                }
                break;
                
            case 2:
                System.out.println("Cuanto quiere retirar");
                double retiro = sc.nextDouble();
                if(retiro > saldo){
                    System.out.println("retire una cantidad correcta");
                continue;
                }  
                saldo = saldo - retiro ;
                break;
            case 3: 
                System.out.println("Tu saldo es: " + saldo);
                break;
            case 4:
                salida = false;
            }

                
        
        }while(salida);
               
    }
}
