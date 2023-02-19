/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Write a method that calculates the sum of the items 
 * Input: [1,4,7,3,6]
 * Output: 21
 */
public class EjercicioRepasoArray {
    
    //Conseguir la suma de las puntuaciones del array
    public  int sumScores(ArrayList<Integer> scoreBoardPar) {
        int add = 0;
        
         for (int i = 0; i < scoreBoardPar.size(); i++) {
              add += scoreBoardPar.get(i); 
        }
         return add;
    }
    //Conseguir el número más alto del array
    public int getHighScore(ArrayList<Integer> scoreBoardPar){
        int max = scoreBoardPar.get(0);
         for (int i: scoreBoardPar) {
             if (i > max){
                 max = i;
             }
         }
         return max;
    }
    //Conseguir el valor medio de la lista
    public double averageScore(ArrayList<Integer> scoreBoardPar){
       double average = 0.0;
        
        if (!scoreBoardPar.isEmpty()){
            average = sumScores(scoreBoardPar) / scoreBoardPar.size();
        }
        return average;
    }
    //Valores al contrario
   public ArrayList<Integer> reverseScores(ArrayList<Integer> scoreBoardPar){
        ArrayList<Integer> scoreBoard2 = new ArrayList<>();
        
       for (int i = (scoreBoardPar.size()-1); i >= 0; i--){
         scoreBoard2.add(scoreBoardPar.get(i));
       }
       return  scoreBoard2;
   }
   
   public ArrayList<String> removeShortWords(ArrayList<String> wordList, int minLength) {
       
       for(int i = 0; i < (wordList.size()-1); i++){
       if( wordList.get(i).length()< minLength){
           System.out.println("La palabra dada no posee el mismo número de caracteres");
           
        }
       }
       return wordList;
       
   }
   


  
    public static void main(String[] args) {
        // TODO code application logic here
     EjercicioRepasoArray array = new EjercicioRepasoArray();
     Scanner sc = new Scanner (System.in);
     ArrayList<Integer> scoreBoard = new ArrayList();
     scoreBoard.add(1);
     scoreBoard.add(4);
     scoreBoard.add(7);
     scoreBoard.add(3);
     scoreBoard.add(6);
     
     System.out.println("");
     System.out.println("[" + scoreBoard.get(0) + ", " + scoreBoard.get(1) + ", "+ scoreBoard.get(2) + ", " + scoreBoard.get(3) + ", " + scoreBoard.get(4) + "]");
     System.out.print("[" + array.sumScores(scoreBoard) + "]" + " ");
     System.out.println("");
     System.out.println(array.getHighScore(scoreBoard));
     System.out.println("");
     System.out.println(array.averageScore(scoreBoard));
     System.out.println(array.reverseScores(scoreBoard));
     System.out.println("");
     
     ArrayList<String> wordList = new ArrayList();
     
     
     System.out.println("¿Cuantas letras tendrán como mínimo?");
     int minLength = sc.nextInt();
     
     System.out.println("¿Cuantas palabras quieres escribir?");
     int numWord = sc.nextInt();
     
     for(int i = 0; i < numWord; i++){
         System.out.print("Dame una palabra");
         String word = sc.nextLine();
         wordList.add(word);
         
     } 
     for(int i = 0; i < numWord; i++){
     wordList = array.removeShortWords(wordList, minLength);
     System.out.println(wordList.get(i));
    }
    
}
}
