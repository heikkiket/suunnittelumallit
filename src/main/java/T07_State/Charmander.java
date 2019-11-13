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
public class Charmander extends AbstractSpecies {
        public final static Charmander instance = new Charmander();

        private Charmander() {}

        @Override
        public void move(Context c) {
                System.out.println("Crawling forward");
        }

        @Override
        public void attack(Context c) {
                System.out.println("Attacking with fire from the tail");
        }

        @Override
        public void levelUp(Context c) {
                this.changeState(c, Charmeleon.instance);
        }
        
}
