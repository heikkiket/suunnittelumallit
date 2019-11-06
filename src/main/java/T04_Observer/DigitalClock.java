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
public class DigitalClock implements Observer {

        private ClockTimer timer;

        public DigitalClock(ClockTimer ct) {
                this.timer = ct;
                ct.attach(this);
        }

        
        @Override
        public void update(Subject theChangedSubject) {
                if(theChangedSubject == timer) {
                        draw();
                }
        }

        private void draw() {
			System.out.println("Time: " + 
				timer.getHour() + ":" +
				timer.getMinute() + ":" +
				timer.getSecond()
			);
        }
        
}
