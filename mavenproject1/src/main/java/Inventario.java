


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renediazoleta
 */
import java.util.Scanner;


public class Inventario {
    public static void main(String[]args) {
        
        //ciclo for para pedir los productos
       for(int i = 1; i <= 2; i++){
           String nombre; 
           String categoria = ""; 
           double costo; 
           int stock;
           //ciclo do while para  leer dos datos ingresados y validar cada categoria sea correcta 
           do{
             System.out.println("ingresa la categoria");
             categoria = Keyboard.readString();
             if(!categoria.equals("AB") && !categoria.equals("DE") && !categoria.equals("LI")){
                 System.out.println("Ingresa una categoria valida (AB,DE,LI)");
                }
            }while(!categoria.equals("AB") && !categoria.equals("DE") && !categoria.equals("LI"));
           
           //ciclo do while para leer dos nombres ingresados y validar que cada nombre sea correcto 
           do{
               System.out.println("ingresa el nombre");
               nombre = Keyboard.readString();
               if(nombre.equals("")){
                   System.out.println("ingresa un nombre valido");
                }
            }while(nombre.equals(""));
           
           //ciclo do while para leer los costos y validar que los costos sean una cantidad correcta
           do{
               System.out.println("ingresa el costo");
               costo = Keyboard.readDouble();
               if(costo <= 0){
                   System.out.println("ingresa un costo valido"); 
                }
            }while(costo <= 0);
           
           //ciclo do while para leer el stock ingresado y validar que el stock sea una cantidad correcta
           do{
              System.out.println("ingresa el stock");
              stock = Keyboard.readInt();
              if(stock <= 0){
                  System.out.println("ingresa un stock valido"); 
                }
            }while(stock <= 0);
           
        }
    }
}