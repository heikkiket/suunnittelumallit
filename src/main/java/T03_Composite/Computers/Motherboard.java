/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03_Composite.Computers;

import T03_Composite.Laiteosa;
import java.util.List;

/**
 *
 * @author heikki
 */
public abstract class Motherboard implements Laiteosa {

	protected List<Laiteosa> parts;
	@Override
	public double getPrice() {
		double sum = 0;
		for(Laiteosa part : parts) {
			sum += part.getPrice();
		}
		return sum;
	}
	
	
}
