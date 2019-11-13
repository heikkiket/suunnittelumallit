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
class Context {
       private Species species;

        public Context() {
                this.changeSpecies(Charmander.instance);
        }

        void changeSpecies(Species instance) {
                System.out.println(instance.getClass().getSimpleName() + ", I choose you!");
                this.species = instance;
        }

        public void attack() {
                species.attack(this);
        }

        public void move() {
                species.move(this);
        }


        public void levelUp() {
                species.levelUp(this);
        }


}
