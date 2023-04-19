/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
package Retos;

import java.util.Arrays;

 public class Reto2{
    public static void main(String[] args) {

        String palabra1 = "amor";
        String palabra2 = "roma";

        boolean esAnagrama = anagrama1(palabra1, palabra2);

        System.out.println(esAnagrama);

        esAnagrama = anagrama2(palabra1, palabra2);

        System.out.println(esAnagrama);
        

    }

    /*
     * Primera solución
     */
    private static boolean anagrama1(String palabra1, String palabra2){
        if(palabra1.equalsIgnoreCase(palabra2)){
            return false;
        }else if(palabra1.length() != palabra2.length()){
            return false;
        }else{

            String[] letras_palabra1 = palabra1.split("");
            String[] letras_palabra2 = palabra2.split("");

            for(int i=0; i<letras_palabra1.length;i++){
                String letra = letras_palabra1[i];

                int index = palabra2.indexOf(letra);

                if(index != -1){
                    letras_palabra2[index] = "";
                }else{
                    break;
                }
               
            }
            palabra2 = String.join("", letras_palabra2);
        }
        
        if(palabra2.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    /*
     * Segunda solución cimportando la librería Arrays
     */
    private static boolean anagrama2(String palabra1, String palabra2){
        if (palabra1.equals(palabra2)) {
            return false;
        }
    
        // Verificar si las palabras tienen la misma longitud
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
    
        // Convertir las palabras en arreglos de caracteres
        char[] letras_palabra1 = palabra1.toCharArray();
        char[] letras_palabra2 = palabra2.toCharArray();
    
        // Ordenar los arreglos de caracteres
        Arrays.sort(letras_palabra1);
        Arrays.sort(letras_palabra2);
    
        // Comparar los arreglos de caracteres ordenados
        return Arrays.equals(letras_palabra1, letras_palabra2);
    }
}