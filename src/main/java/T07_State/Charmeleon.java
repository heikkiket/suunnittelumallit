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
public class Charmeleon extends AbstractSpecies {
        public final static Charmeleon instance = new Charmeleon();

        private Charmeleon() {}

        @Override
        public void move(Context c) {
                System.out.println("Crawling slowly forward");
        }

        @Override
        public void attack(Context c) {
                System.out.println("Attacking with fire from the tail");
        }

        @Override
        public void levelUp(Context c) {
                this.changeState(c, Charichard.instance);
        }
        
}
