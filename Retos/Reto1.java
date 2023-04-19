/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
package Retos;

 public class Reto1{
    public static void main(String[] args) {
        
        for(int i=1;i<=100;i++){
            int multiplo_tres = i % 3;
            int multiplo_cinco = i % 5;

            if(multiplo_tres == 0 && multiplo_cinco == 0){
                System.out.println("fizzbuzz");
            }else if(multiplo_tres == 0){
                System.out.println("fizz");
            }else if(multiplo_cinco == 0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
        
        
    }
 }