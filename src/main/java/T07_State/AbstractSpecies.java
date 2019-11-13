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
public abstract class AbstractSpecies implements Species {

        
        protected void changeState(Context context, Species instance) {
                System.out.println("Evolving into " + instance.getClass().getSimpleName());
                context.changeSpecies(instance);
        }

        public void move() {}

        public void attack() {}

        public void levelUp() { 

        }
        
}
