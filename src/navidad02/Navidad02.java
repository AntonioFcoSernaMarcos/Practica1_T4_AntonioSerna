/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navidad02;
import java.io.*;
import java.util.Scanner;
/**
 * Clase suma los numeros introducidos por teclado
 * @author Antonio Francisco 
 * @author Serna Marcos
 * @since 13.01.2021
 * 
 */

public class Navidad02 {
    /**
     * @param contador
     * @param leido
     * @param scanner
     */
  
    private static int contador;
    private static boolean leido;
    static Scanner entrada=new Scanner(System.in);
    /**
     * Metodo pideNumero
     * Este método sirve para introducir un numero entero por teclado (Este tambien mira si es entero o no)
     * @return numero : Numero entero
     */
    public static int pideNumero(){
        int numero=0;
         do{
         System.out.print("Nº"+contador+" Digame un numero (Este proceso terminara cuando pongas 0): ");
            if (entrada.hasNextInt()){
                leido=true;
                numero=entrada.nextInt();
            }
            else{
                leido=false;
                System.out.println("El valor introducido no es correcto introduzca otro");
                entrada.nextLine();
            }
         }while (leido==false);
         
     return numero; 
    }
    public static void main(String[] args) {
        int numero=0;
        int resultado=0;
        numero=pideNumero() ;/**Introducir por teclado*/
      while (numero!=0){
        resultado=resultado+numero;/**Sumar los numeros introducidos*/
        contador++;/**Para contar cuantos numeros hay*/
        numero=pideNumero() ;   
      }
      
      contador++;
      /**Expone los resultados*/
      System.out.println("Ha puesto en total "+contador+" numeros");
      System.out.println("Este es la suma de los numeros que usted ha puesto "+resultado);
      System.out.println("Fin del programa");
        
        
    }
    
}
