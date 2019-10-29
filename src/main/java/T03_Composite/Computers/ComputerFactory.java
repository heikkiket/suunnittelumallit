/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03_Composite.Computers;

/**
 *
 * @author heikki
 */
public abstract class ComputerFactory {
	
	public abstract Computer getComputer();
	public abstract Motherboard getMotherboard();
	public abstract HardDrive getHardDrive();
}
