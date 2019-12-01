/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T18_Prototype;

/**
 *
 * @author heikki
 */
public class ClockHand implements Cloneable {
    
    int value;
    int upperLimit;

    ClockHand(int value, int limit) {
        this.value = value;
        this.upperLimit = limit;
    }

    void setValue(int value) {
        if(value <= upperLimit) {
            this.value = value;
        }
    }

    public boolean advance() {
        value++;
        if(value > upperLimit) {
            value = 0;
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return String.format("%02d", value);
    }

    @Override
    protected ClockHand clone() throws CloneNotSupportedException {
        return (ClockHand) super.clone(); 
    }

    

    
}
