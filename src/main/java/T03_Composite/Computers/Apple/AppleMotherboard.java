/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03_Composite.Computers.Apple;

import T03_Composite.Computers.IntelProcessor;
import T03_Composite.Computers.Lenovo.DDR2RAM;
import T03_Composite.Computers.Motherboard;
import T03_Composite.Laiteosa;
import java.util.ArrayList;

/**
 *
 * @author heikki
 */
public class AppleMotherboard extends Motherboard {

	public AppleMotherboard() {
		this.parts = new ArrayList<Laiteosa>();
		parts.add(new IntelProcessor());
		parts.add(new DDR2RAM());
	}

	@Override
	public double getPrice() {
		double price = super.getPrice(); //To change body of generated methods, choose Tools | Templates.
		double appleTax = 500;
		return price + appleTax;
	}
	
	
}
