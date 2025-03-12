/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.bean;
import java.util.Arrays;
import java.util.List;
import ma.projet.Personne;
/**
 *
 * @author adhmin
 */


public class Test {

    public static void listerPersonnes(List<? extends Personne> personnes) {
        for (Personne personne : personnes) {
            System.out.println(personne.affiche() + ", Salaire calculé: " + personne.calculerSalaire());
        }
    }

    public static void main(String[] args) {
        Developpeur dev1;
        dev1 = new Developpeur(1, "amal", "Tahiri", 3000, "Python");
        Manager manager1;
        manager1 = new Manager(2, "Halima", "Moustine", 5000, "Java");

        List<Personne> personnes = Arrays.asList(dev1, manager1);
        listerPersonnes(personnes);
    }
}
