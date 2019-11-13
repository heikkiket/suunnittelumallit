/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T07_State;

/**
 *
 * @author heikki
 */
public class Charichard extends AbstractSpecies {
        public final static Charichard instance = new Charichard();

        private Charichard() {}

        @Override
        public void move(Context c) {
                System.out.println("Flying! Wheee");
        }

        @Override
        public void attack(Context c) {
                System.out.println("Attacking with fire from all over the body");
        }

        @Override
        public void levelUp(Context c) {
                System.out.println("This is the highest form. No further evolution possible.");
        }

}
