/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class DAWProgramacionRecuperacionFRG1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         String entrada;
         boolean continuar = true;
         int PropTrue = 0;
         int PropFalse = 0;
         do{
             //Opciones
            System.out.println("1. Realizar algoritmo ");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("3. Salir");
            
            sc.reset();
            entrada = sc.nextLine();
            switch (entrada) {
                case "1":
                    System.out.println("");
                    System.out.println("-----INICIO-----");
                    System.out.println("Solicitud de abastecimiento");
                    
                    String question0;
                    do{
                        System.out.println("¿Es una compra nueva?");
                         question0 = sc.next();
                        if("Si".equals(question0) ){
                            System.out.println("");
                            System.out.println("Petición de ofertas y/o presupuesto");
                            
                                    String question2;
                            do{
                                do{
                                    System.out.println("¿Precio adecuado?");
                                    question2 = sc.next();
                                     PropFalse++;
                                }while("No".equals(question2));
                                
                                System.out.println("Aprobación del proveedor");
                                System.out.println("");
                                System.out.println("Realización del pedido");
                                System.out.println("");
                                PropTrue++;
                            }while(!"Si".equals(question2) && !"No".equals(question2));
                        }
                        else if("No".equals(question0)){
                            System.out.println("");
                            
                            String question1;
                            do{
                                System.out.println("¿Proveedor indicado?");
                                 question1 = sc.next();

                                if("Si".equals(question1) ){
                                    System.out.println("");
                                    System.out.println("Realización del pedido");  
                                    System.out.print("");
                                }
                                else if("No".equals(question1)){
                                    System.out.println("");
                                    System.out.println("Petición de ofertas y/o presupuesto");
                                    String question3;
                                    do{
                                        do{
                                         System.out.println("¿Precio adecuado?");
                                            question3 = sc.next();
                                                PropFalse++;
                                        }while("No".equals(question3));
                                
                                        System.out.println("Aprobación del proveedor");
                                        System.out.println("");
                                        System.out.println("Realización del pedido");
                                        System.out.println("");
                                        PropTrue++;
                                    }while(!"Si".equals(question3) && !"No".equals(question3));
                                   }
                            }while(!"Si".equals(question1) && !"No".equals(question1));
                        }
                    }while(!"Si".equals(question0) && !"No".equals(question0));
                    break;
                case "2":
                    System.out.println("Numero de peticiones realizadas: ");
                    System.out.println("Peticiones aceptadas: "+ PropTrue);
                    System.out.println("Peticiones rechazadas: " + PropFalse);
                    break;
                case "3":
                   continuar = false;
            }
         }while(continuar);
    }
    
}
