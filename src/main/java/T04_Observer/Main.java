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
public class Main {
	
	public static void main(String[] args) throws InterruptedException {

		ClockTimer timer = new ClockTimer();
		DigitalClock clock = new DigitalClock(timer);

		for( int i =0; i < 70; i++) {
			Thread.sleep(1000);
			timer.update();
		}
		
	}
}
