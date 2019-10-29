/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03_Composite.Computers.Lenovo;

import T03_Composite.Computers.IntelProcessor;
import T03_Composite.Computers.Motherboard;
import T03_Composite.Laiteosa;
import java.util.ArrayList;


public class LenovoMotherboard extends Motherboard {

	public LenovoMotherboard() {
		this.parts = new ArrayList<Laiteosa>();
		this.parts.add(new IntelProcessor());
		this.parts.add(new DDR2RAM());
	}

	
}
