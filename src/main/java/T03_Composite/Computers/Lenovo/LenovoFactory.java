/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03_Composite.Computers.Lenovo;

import T03_Composite.Computers.Computer;
import T03_Composite.Computers.ComputerFactory;
import T03_Composite.Computers.HardDrive;
import T03_Composite.Computers.Motherboard;
import T03_Composite.Laiteosa;
import java.util.ArrayList;

/**
 *
 * @author heikki
 */
public class LenovoFactory extends ComputerFactory {

	@Override
	public Computer getComputer() {
		Computer comp = new LenovoThinkpad();
		comp.addPart((Laiteosa) this.getMotherboard());
		comp.addPart((Laiteosa) this.getHardDrive());
		return comp;
	}

	@Override
	public Motherboard getMotherboard() {
		return new LenovoMotherboard();
	}

	@Override
	public HardDrive getHardDrive() {
		return new LenovoHardDrive();
	}


	
}
