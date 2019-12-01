/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T18_Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author heikki
 */
public class Clock implements Cloneable {
    
    ClockHand minutes;
    ClockHand hours;

    public Clock(int hours, int minutes) {
        this.minutes = new ClockHand(minutes, 59);
        this.hours = new ClockHand(hours, 23);
    }

    public void advance() {
        //If minutes go back to zero, advance hours by one
        if (!minutes.advance()) {
            hours.advance();
        }
    }

    @Override
    public String toString() {
        return hours.toString() + ":" + minutes.toString();
    }

    public Clock clone() {
        try {
            Clock c = (Clock) super.clone();
            c.hours = (ClockHand) hours.clone();
            c.minutes = (ClockHand) minutes.clone();
            return c;
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
