/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T04_Observer;

/**
 *
 * @author heikki
 */
public interface Observer {
        public abstract void update(Subject theChangedSubject); 
}
