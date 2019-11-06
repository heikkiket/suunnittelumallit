/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T04_Observer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author heikki
 */
public class ClockTimer extends Subject {
	
	private long time;

	public ClockTimer() {
		time = System.currentTimeMillis() / 1000;
	}

	private void tick() throws InterruptedException {
		this.time++;
        this.myNotify();
	}

	public int getHour() {
		return (int) this.time % (60 * 60 * 24) / (60 * 60);
	}

	public int getMinute() {
		return (int) this.time % (60 * 60) / 60;
	}

	public int getSecond() {
		return (int) this.time % 60;
	}

	void update() {
            try {
                    this.tick();
            } catch (InterruptedException ex) {
                    Logger.getLogger(ClockTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
	}

	
}
