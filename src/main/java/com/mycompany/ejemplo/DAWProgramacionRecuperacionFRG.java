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
public class DAWProgramacionRecuperacionFRG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        String entrada;
        int Emails = 0;
        int Medidas = 0;
        
        System.out.println("Sistema de clasificación de Tickets de detección temprana de Ciberdelincuencia: ");
        do{
            //Opciones
            System.out.println("a. Gestionar incidente de convivencia. ");
            System.out.println("b. Mostrar estadísticas");
            System.out.println("c. Salir (o cualquier otra tecla)");
            
            sc.reset();
            entrada = sc.nextLine();
        switch (entrada) {
            case "a":
                System.out.println("");
                System.out.println("----Inicio----");
                System.out.println("Sucede la conducta disruptiva sancionable en mi sesión o guardias");
                System.out.println("");
               
                 
                String question1;
                do{
                    System.out.println("¿La incidencia supone expulsión del aula?");
                    question1 = sc.next();
                   if("Si".equals(question1) ){   
                       System.out.println("En el momento: Relleno parte");
                       System.out.println("");
                       System.out.println("Alumno acude a jefatura de estudios y rellena parte. ");
                       System.out.println("J.E informa telefónicamente a la familia");
                       System.out.println("Profesorado de guardia comprueba tiempos. ");
                       
                       Emails++;
                       
                       System.out.println("");
                       System.out.println("J.E informa al tutoria y le dan el parte");
                       System.out.println("");
                       System.out.println("¿Eres su turor/a?");
                       String question2;
                       
                        do{
                            System.out.println("¿Eres su turor/a?");
                             question2 = sc.next();
                              if("Si".equals(question2) ){  
                               System.out.println("Introduzca en SIGAD DIDÁCTICA el parte que he rellenado");
                               System.out.println("O que me habra dado J.E");
                               System.out.println("");
                               System.out.println("La familia recibe e-mail generado por SIGAD DIDÁCTICA automáticamente con la información introducida");
                               System.out.println("");
                               
                               String question3;
                               
                               do{
                                   System.out.println("¿Procede medida correctora, etc?");
                                    question3 = sc.next();
                                    if("Si".equals(question3) ){  
                                        Medidas++;
                                        
                                        String question4;
                                        do{
                                            System.out.println("¿Eres su tutor/a o docente?");
                                             question4 = sc.next();
                                            if("Si".equals(question4) ){  
                                             System.out.println("Realizó el seguimiento de la medida adoptada por Dto. Orientacion y Jefatura");
                                             System.out.println("E informo a tutoria y J.E");
                                             System.out.println("");
                                             System.out.print("FIN");
                                            }
                                            else if("No".equals(question4)){
                                                System.out.println("");
                                                System.out.println("FIN");
                                            }
                                            
                                        }while(!"Si".equals(question4) && !"No".equals(question4));
                                        
                                    }
                                    else if("No".equals(question3)){
                                        System.out.println("FIN");
                                    }
                               }while(!"Si".equals(question3) && !"No".equals(question3));
                               
                               
                              }
                              else if("No".equals(question2)){
                               System.out.println("");
                               String question5;
                               do{
                                  System.out.println("¿Procede medida correctora, etc?");
                                   question5 = sc.next(); 
                                    if("Si".equals(question5) ){  
                                         Medidas++;
                                        
                                        String question6;
                                        do{
                                            System.out.println("¿Eres su tutor/a o docente?");
                                             question6 = sc.next();
                                            if("Si".equals(question6) ){  
                                             System.out.println("Realizó el seguimiento de la medida adoptada por Dto. Orientacion y Jefatura");
                                             System.out.println("E informo a tutoria y J.E");
                                             System.out.println("");
                                             System.out.println("FIN");
                                            }
                                            else if("No".equals(question6)){
                                                System.out.println("");
                                                System.out.println("FIN");
                                            }
                                            
                                        }while(!"Si".equals(question6) && !"No".equals(question6));
                                        
                                    }
                                    else if("No".equals(question5)){
                                        System.out.println("FIN");
                                    }
                                   
                               }while(!"Si".equals(question5) && !"No".equals(question5));
                               
                               
                              }
                         }while(!"Si".equals(question2) && !"No".equals(question2));
                       
                   }  
                   else if("No".equals(question1)){
                       System.out.println("Al terminar la sesión: Relleno parte ");
                       System.out.println("");
                       System.out.println("Entrego a jefatura de estudios");
                       System.out.println("");
                       System.out.println("Valoración por J.E. y Dto. Orientacion (gravedad, cómputo puntos, medidas a adoptar...)");
                       System.out.println("");
                       System.out.println("J.E informa al tutoria y le dan el parte");
                       System.out.println("");
                       System.out.println("¿Eres su turor/a?");


                   }
                }while(!"Si".equals(question1) && !"No".equals(question1));
                 break;
            case "b":
                System.out.println("Mostrar estadísticas: emails enviados y número de medidas disciplinarias.");
                System.out.println("-Emails: " + Emails);
                System.out.println("-Medidas emitidas: " + Medidas);
                 break;
            case "c":
                continuar=false;
        }        
                    
        }while(continuar);
    }
    
}
