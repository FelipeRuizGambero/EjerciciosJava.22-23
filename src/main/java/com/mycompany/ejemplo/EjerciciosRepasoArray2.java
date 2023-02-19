/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mint
 */
public class EjerciciosRepasoArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EjerciciosRepasoArray2 array = new EjerciciosRepasoArray2();
        // TODO code application logic here
        System.out.println("¿Cuantas palabras quieres tener?");
        int words = sc.nextInt();
        
        System.out.println("Array de " + words + " palabras");
        ArrayList<String> wordList= new ArrayList<>();
        for (int i = 0; i < words; i++){
            wordList.add(sc.next());
        }
        
        System.out.println("¿Por cual palabra quieres truncar la lista anterior?");
        String truncate = sc.next();
        
        System.out.println("Palabras hasta " + truncate + ":");
        ArrayList<String> truncateList = truncateAfter(wordList, truncate);
        showList(truncateList);
        
        System.out.println("¿Que palabra escoges para conseguir su posición?");
        String pos = sc.next();
        System.out.println("Posición del elemento");
        System.out.println(array.findValue(wordList, pos));
        System.out.println("");
        String duplicate ="";
        
       
        do{
            System.out.println("¿Quieres eliminar los duplicados?");
            duplicate = sc.nextLine();
 
        }while(!duplicate.equals("s") && !duplicate.equals("S"));
        
        wordList = array.removeDuplicates(wordList);
        showList(wordList);
     
         
    }
    
    public static void showList(ArrayList<String> values)
    {
         for (String word: values) {
            System.out.println(word);
        }
        
    }
    public static ArrayList<String> truncateAfter(ArrayList<String> values, String x){
        ArrayList<String> truncated = new ArrayList<>();
        for(String word: values){
            if(word.equals(x)){
                return truncated;
            }
            truncated.add(word);
        }
        return truncated;
    }
    
    public  int findValue(ArrayList<String> value, String x){
        // Return the position of `x` inside `values`,
        // return -1 if `x` is not found
        for(int i = 0; i < value.size(); i++){
        if(value.get(i).equals(x)){
            return i;
        }    
     }
        return -1;
    }
    
    public  ArrayList <String> removeDuplicates(ArrayList<String> values){
        ArrayList<String> noDuplicates = new ArrayList<>();
        for(String s: values){
            if (! noDuplicates.contains(s)){
                noDuplicates.add(s);
            }
        }
        return noDuplicates;
    }
   /* public static ArrayList<String> commonValues(ArrayList<String> values1, ArrayList<String> values2){
        // Return a new ArrayList containing the elements that
	// are present both in 'values1' and 'values2', without duplicates
        
    }*/
}
