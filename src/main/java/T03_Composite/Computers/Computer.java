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
public abstract class Computer implements Laiteosa {
	
	protected List<Laiteosa> parts;

	@Override
	public double getPrice() {
		double summa = 0;
		for (Laiteosa part : parts) {
			summa += part.getPrice();
		}

		return summa;
	}

	@Override
	public String toString() {
		String result = "";
		for (Laiteosa part : parts) {
			String row = String.format("%1$-20s....... %2$3.2f", 
				part.getClass().getSimpleName(), 
				part.getPrice())
				+ "\n";
			result = result + row;
		}
		result = result + "TOTAL:   " + this.getPrice();
		return result;
	}

	

	/**
	 *
	 * @param part
	 */
	public void addPart(Laiteosa part){
		parts.add(part);
	}

}
