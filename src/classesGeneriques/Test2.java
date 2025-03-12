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
public class Test2 {
     public static void main(String[] args) {
      
        TripletH<Integer, String, Double> triplet1 = new TripletH<>(42, "HALIMA", 3.14);
        System.out.println("Triplet 1 :");
        triplet1.affiche();
        System.out.println("Premier élément : " + triplet1.getPremier());
        System.out.println("Deuxième élément : " + triplet1.getSecond());
        System.out.println("Troisième élément : " + triplet1.getTroisieme());
        System.out.println();

     
        TripletH<String, Double, Boolean> triplet2;
         triplet2 = new TripletH<>("Bonjour", 2.6, false);
        System.out.println("Triplet 2 :");
        triplet2.affiche();
        System.out.println("Premier élément : " + triplet2.getPremier());
        System.out.println("Deuxième élément : " + triplet2.getSecond());
        System.out.println("Troisième élément : " + triplet2.getTroisieme());
        System.out.println();

    
        TripletH<Boolean, Integer, String> triplet3 = new TripletH<>(false, 3, "amar");
        System.out.println("Triplet 3 :");
        triplet3.affiche();
        System.out.println("Premier élément : " + triplet3.getPremier());
        System.out.println("Deuxième élément : " + triplet3.getSecond());
        System.out.println("Troisième élément : " + triplet3.getTroisieme());
    }
}

