/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
import java.math.BigInteger;

public class Reto3{
    public static void main(String[] args) {

        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");

        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<48;i++){
            BigInteger c = a.add(b);
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}