/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author adhmin
 */

class NombreInvalideException extends Exception {

    public NombreInvalideException(String message) {
        super(message);
    }
}

public class Fibonacci {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws NombreInvalideException {
        System.out.println("Veuillez saisir la position de la suite de Fibonacci : ");
        int n = sc.nextInt();
        if (n <= 0) {
            throw new NombreInvalideException("Le nombre doit être supérieur à 0.");
        }
        fibonacci(n);
        System.out.println("la suite de fibonnaci pour " + n + " est :" + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
