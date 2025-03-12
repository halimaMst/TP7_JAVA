/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author adhmin7
 */


public class SaisieCorrecte {

    public static int saisieCorrecte() {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean saisieValide = false;

        while (!saisieValide) {
            try {
                System.out.print("Veuillez saisir un entier supérieur à 10 : ");
                nombre = scanner.nextInt();

             
                if (nombre <= 10) {
                    throw new IllegalArgumentException("Erreur : l'entier doit être supérieur à 10.");
                }

                saisieValide = true; 
            } catch (InputMismatchException n) {
                System.out.println("Erreur : vous devez saisir un entier valide.");
                scanner.next();
            } catch (IllegalArgumentException n) {
                System.out.println(n.getMessage());
            }
        }

        return nombre;
    }

    public static void main(String[] args) {
        int nombre = saisieCorrecte();
        System.out.println("Vous avez saisi l'entier valide : " + nombre);
    }
}