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
public class Main {
        public static void main(String[] args) {
                Context pokeworld = new Context();

                for (int i = 1; i < 4; i++) {
                        pokeworld.move();
                        pokeworld.attack();
                        pokeworld.levelUp();
                }
        }
 
}
