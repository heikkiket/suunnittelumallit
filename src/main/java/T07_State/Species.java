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
public interface Species {
       public void move(Context c);
       public void attack(Context c);
       public void levelUp(Context c);
}
