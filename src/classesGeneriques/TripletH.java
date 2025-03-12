/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesGeneriques;

/**
 *
 * @author adhmin
 * @param <S>
 * @param <L>
 * @param <N>
 */

public class TripletH<S, L, N> {
    private S premier;
    private L second;
    private N troisieme;

    public TripletH(S premier, L second, N troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    public S getPremier() {
        return premier;
    }

    public L getSecond() {
        return second;
    }

    public N getTroisieme() {
        return troisieme;
    }

    public void affiche() {
        System.out.println("Premier : " + premier);
        System.out.println("Second : " + second);
        System.out.println("Troisieme : " + troisieme);
    }
}  

