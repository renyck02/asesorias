


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
        //estas son las variables de la categoria
        int TotalAB = 0;
        int TotalDE = 0;
        int TotalLI = 0;
        int Totalbajo = 0;
        int Totalnormal = 0;
        int Totalalto = 0;
        String lineaAb = "";
        String lineaDe = "";
        String lineaLi = "";
        
        //ciclo for para pedir los productos
       for(int i = 1; i <= 2; i++){
           
           String linea = "";
           String status = "";
           String nombre = ""; 
           String categoria = ""; 
           double costo = 0; 
           int stock = 0;
           
           
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
               if(costo < 0){
                   System.out.println("ingresa un costo valido"); 
                }
            }while(costo < 0);
           
           //ciclo do while para leer el stock ingresado y validar que el stock sea una cantidad correcta
           do{
              System.out.println("ingresa el stock");
              stock = Keyboard.readInt();
              if(stock <= 0){
                  System.out.println("ingresa un stock valido"); 
                }
            }while(stock <= 0);
           
           if(stock >= 0 && stock <= 10){
           Totalbajo++;
           status ="bajo";
           }
           if(stock >= 11 && stock <= 50){
               Totalnormal++;
               status ="normal";
           }
           if(stock > 50){
               Totalalto++;
               status ="alto";
           }
           linea = String.format("%-10s, $%9.2f, %4d, %-5s %n,",
                                nombre, costo, stock, status);
           
           
     //sirve para checar la categoria en la que estamos y si es dependiendo de la cate. que escogio y se le suma 1
     //por que el ejercicio nos pide el total de categorias que hay por producto
         switch(categoria){
                case "AB":
                    TotalAB++;
                    lineaAb += TotalAB;
                     break;
                case "DE":
                    TotalDE++;
                     lineaDe += TotalDE;
                     break;
                case "LI":
                    TotalLI++;
                    lineaLi += TotalLI;
                     break;
            }
        }
       System.out.println("categoria abarrotes");
       System.out.println(lineaAb);
       System.out.println(lineaDe);
       System.out.println(lineaLi);
    }
}