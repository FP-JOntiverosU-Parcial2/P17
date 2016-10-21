/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema17;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,o;
        
        n1=solicitarDato("a: ");  //solicitamos Datos
        n2=solicitarDato("b: ");
        o=operacion(n1,n2);
        System.out.println("El MCD es: " + operacion(n1,n2));  //muestra resultado
        mensajeSalida();
    }
    
    public static int solicitarDato(String d){  
        int dato;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el numero " + d);
        dato= teclado.nextInt();
        return dato ;
}
    public static int operacion(int n1, int n2){
        if(n1>n2) {   //se comparan los numeros en if
            int n1x=n2;  //si n1 es mayor se intercambia de valor a n2
            n2=n1;
            n1=n1x;
        }
        int c=1;  //se le asigna un valor a c dando el mcd
        while( c!= 0){ c= n2 % n1;  //obtenemos el mcd
                if(c!=0) {
                    n2=n1;
                    n1=c;
                }
                    
                }
            
        return n1;   
        
    }
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //se agradece
        System.exit(0);//Sale del programa
     }
}
