/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosProgramacion1;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer4Tema1 {
    
    
    
    public static void main(String[] args) {
        
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[37m";
        
    System.out.printf("| %-10s   |    %10s   |  %-10s  |  %10s    |   %-10s  |\n",  rojo+"LUNES", rojo+"MARTES", rojo+"MIERCOLES", rojo+"JUEVES", rojo+"VIERNES" );
    System.out.println(rojo+"----------------------------------------------------------------------------------------");
    System.out.printf("| %-10s   |    %10s    |    %-10s    |    %10s   |    %-10s   |\n",  azul+"SIS", verde+"PRO", verde+"PRO", naranja+"XXX", morado+"L-M" );
    System.out.printf("| %-10s   |    %10s    |    %-10s    |    %10s   |    %-10s   |\n",  azul+"SIS", verde+"PRO", verde+"PRO", naranja+"XXX", morado+"L-M" );
    System.out.printf("| %-10s   |    %10s    |    %-10s    |    %10s   |    %-10s   |\n",  azul+"SIS", verde+"PRO", morado+"L-M", naranja+"XXX", naranja+"XXX" );
    System.out.println(rojo+"----------------------------------------------------------------------------------------");
    System.out.printf("| %-10s   |    %10s    |    %-10s    |    %10s   |    %-10s   |\n",  naranja+"XXX", naranja+"XXX", morado+"L-M", verde+"PRO", azul+"SIS" );
    System.out.printf("| %-10s   |    %10s    |    %-10s    |    %10s   |    %-10s   |\n",  naranja+"XXX", naranja+"XXX", naranja+"XXX", verde+"PRO", azul+"SIS" );
    System.out.printf("| %-10s   |    %10s    |    %-10s    |    %10s   |    %-10s   |\n",  naranja+"XXX", naranja+"XXX", naranja+"XXX", verde+"PRO", azul+"SIS" );
    System.out.println(rojo+"----------------------------------------------------------------------------------------");
    
    
    
    

    }
    
}
