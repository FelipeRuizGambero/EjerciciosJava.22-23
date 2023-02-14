/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;
import java.util.Random;

/**
 *
 * Se busca tener una lista de números entre un máximo en una lista y un mínimo que será
 * un número dado, este número indicará las posiciones de la lista que queremos usaar hasta el final
 * numero maximo= 50
 * numero minimo = 3
 * lista : 47, 48, 49, 50
 */

public class Elegidos {
    //estado del objeto
    int numerosDispensados; 
    int max, min, num;
    boolean[]lista;
    //Random rand;
    // boolean repetir = true;
   
   //comportamiento
   //constructor

public Elegidos (int minimo, int maximo){
      max = maximo;
      min = minimo;
      numerosDispensados = 0;
      
      int tamanio =(max - min)+1;
      lista = new boolean[tamanio];
      
      Random rand = new Random();
      
      for(int i=0; i< lista.length; i++){
          lista[i] = false;
          
      }
}
//siguiente número a devolver, entre min y max con ellos incluidos
//sin repeticion de ningun número previo

public int numRand (){
   boolean repetir= true;
   int num = 0; 
   Random rand = new Random();
   
   if(numerosDispensados < max-min+1) {
      while(repetir){
         num = rand.nextInt(max-min+1);
       
          if(!lista[num]){
             repetir = false;
             lista[num] = true;
          }
     }
      num+=min;
      numerosDispensados++;
      return num;
   } else return min-1;  
  }
} 
    