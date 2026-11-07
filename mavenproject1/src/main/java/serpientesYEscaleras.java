/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renediazoleta
 */
import java.util.Scanner;
import java.util.Random;
public class serpientesYEscaleras {
    public static void main(String[] args) {
        int cantidad;
        boolean terminado = false;
        
        Random random = new Random();
        int ganador;
        do{
          System.out.println("Ingresa la cantidad de jugadores");
          cantidad = Keyboard.readInt();
           
           if(cantidad > 5 || cantidad < 2){
               System.out.println("Ingresa una cantidad correcta");
               
           }else{
              break; 
           }
           
           
        }while(true);
        
        String[]nombres = new String[cantidad];
        int[] posiciones = new int[cantidad];
        for(int j = 0; j < cantidad; j++){
            System.out.println("ingresa el nombre del jugador: " + (j+1));
            nombres[j] = Keyboard.readString();   
        }
        while(!terminado){
           
            for(int n = 0; n < posiciones.length; n++){
                int dado1 = random.nextInt(6-1) + 1;
                System.out.println(nombres[n]);
                System.out.println(nombres[n] + " tiro el dado y saco: " + dado1);
                int dado2 = random.nextInt(6-1) + 1;
                System.out.println(nombres[n] + " tiro el dado y saco: " + dado2);
                int resultado = dado1 + dado2;
                posiciones[n] += resultado;
                System.out.println("El resultado de los dados es: " + resultado);
                System.out.println(nombres[n] + " esta en la posicion " + posiciones[n]);
                
                // LAS SERPIENTES
                if(posiciones[n] == 13){
                   posiciones[n] = 5;
                   System.out.println("Tu posicion es:" + posiciones[n]);
                }
                if(posiciones[n] == 78){
                   posiciones[n] = 22;
                   System.out.println("Tu posicion es:" + posiciones[n]);
                }
                if(posiciones[n] == 98){
                   posiciones[n] = 64;
                   System.out.println("Tu posicion es:" + posiciones[n]);
                }
                if(posiciones[n] == 66){
                   posiciones[n] = 16;
                   System.out.println("Tu posicion es:" + posiciones[n]);
                }
                
                // LAS ESCALERAS
                if(posiciones[n] == 8){
                   posiciones[n] = 26;
                   System.out.println("Tu posicion es:" + posiciones[n]);
                }
                if(posiciones[n] == 17){
                   posiciones[n] = 33;
                   System.out.println("Tu posicion es:" + posiciones[n]);
                }
                if(posiciones[n] == 55){
                   posiciones[n] = 73;
                   System.out.println("Tu posicion es:" + posiciones[n]);
                }
                if(posiciones[n] > 100){
                   posiciones[n] -= resultado;
                   continue;
                }
                
                if(posiciones[n] == 100){
                    terminado = true;
                System.out.println("El ganador es " + nombres[n]);
                break;
                }
            }
        }
    }
}
