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
public class DAWProgramacionRecuperacionFRG2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        * Escriba un programa que pregunte cuántos números se van a introducir, pida esos números
        * uno a uno y muestre si cada número introducido es menor, igual o mayor al anterior
        */
        Scanner sc = new Scanner(System.in);
        
        int question0;
        do{
        System.out.println("¿Cuantos números se van a introducir?");
        question0 = sc.nextInt();
        if(question0 <= 1){
            System.out.println("¡Imposible!");
        }
        }while(question0 <= 1);
             
           /* for(int i = 0; i < question0; i++){
                
                int num;
                int num2;
                int num3;
                
                if(i == 0){
                    System.out.print("Escriba el "+(i+1)+" número: ");
                     num = sc.nextInt();
                     System.out.print("Escriba el " + (i+2) +" número: ");
                         num2 = sc.nextInt();
                    i++;     
                    
                }else{
                    System.out.print("Escriba el "+(i+1)+" número: ");
                     num = sc.nextInt();
                     System.out.print("Escriba el " + (i+2) +" número: ");
                      num2 = sc.nextInt();
                    i++;     
                     
                    i++;
                }
                if(num > num2){
                        System.out.println(num +" es mayor que "+num2);
                    }
                    else if(num < num2){
                        System.out.println(num +" es menor que "+num2);
                    }
                    else{
                        System.out.println(num +" y "+num2 + " son iguales");
                    }       
              */
           
                System.out.print("Escriba el 1º número: ");
                    int first = sc.nextInt();
                    
                for(int i = 1; i < question0; i++){
                    System.out.print("Escriba el "+(i+1)+"º número: " );
                      int  actual = sc.nextInt();
                    
                    if(first > actual){
                        System.out.println(first +" es mayor que "+actual);
                    }
                    else if(first < actual){
                        System.out.println(first +" es menor que "+actual);
                    }
                    else{
                        System.out.println(first +" y "+actual + " son iguales");
                    }    
                     first = actual;
                }
    
        
    }
    
}
