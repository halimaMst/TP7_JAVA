/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesGeneriques;

/**
 *
 * @author adhmin
 */
public class Test1 {
    
    public static void main(String[] args) {
     
        Triplet<Integer> tripletEntiers;
        tripletEntiers = new Triplet<>(40, 100, 2);
        System.out.println("Triplet d'entiers :");
        tripletEntiers.affiche();
        System.out.println("Premier élément : " + tripletEntiers.getPremier());
        System.out.println("Deuxième élément : " + tripletEntiers.getSecond());
        System.out.println("Troisième élément : " + tripletEntiers.getTroisieme());
        System.out.println();

        Triplet<String> tripletChaines;
        tripletChaines = new Triplet<>("Halima", "Taha", "Amina");
        System.out.println("Triplet de chaînes :");
        tripletChaines.affiche();
        System.out.println("Premier élément : " + tripletChaines.getPremier());
        System.out.println("Deuxième élément : " + tripletChaines.getSecond());
        System.out.println("Troisième élément : " + tripletChaines.getTroisieme());
        System.out.println();

    }
}

