/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03_Composite.Computers.Apple;

import T03_Composite.Computers.Computer;
import T03_Composite.Computers.ComputerFactory;
import T03_Composite.Computers.HardDrive;
import T03_Composite.Computers.Motherboard;

/**
 *
 * @author heikki
 */
public class AppleFactory extends ComputerFactory {

	@Override
	public Computer getComputer() {
		Computer comp = new MacPro();
		comp.addPart(this.getMotherboard());
		comp.addPart(this.getHardDrive());
		return comp;
	}

	@Override
	public Motherboard getMotherboard() {
		return new AppleMotherboard();
	}

	@Override
	public HardDrive getHardDrive() {
		return new AppleHardDrive();
	}
	
}
