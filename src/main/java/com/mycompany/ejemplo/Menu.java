/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo;

/**
 *
 * @author mint
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        do{
        mostrarOpcion("","Menu opciones disponibles:");
        mostrarOpcion("0","Salir");
        mostrarOpcion("1","Opcion1");
        mostrarOpcion("2","Opcion2");
        mostrarOpcion("3","Opcion3");
        mostrarOpcion("4","Opcion4");
        }while(opcion != 0);
        
    }
        private static void mostrarOpcion (String numero, String descr){
            String resultado = "#### ----";
            if (!numero.isEmpty()){
                resultado = resultado + numero + " ";
                
            }
            resultado = resultado + descr;
            resultado = resultado + "---- ####";
            System.out.println(resultado);
        }
    
}
