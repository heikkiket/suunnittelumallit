/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03_Composite;

import T03_Composite.Computers.Apple.AppleFactory;
import T03_Composite.Computers.Computer;
import T03_Composite.Computers.ComputerFactory;
import T03_Composite.Computers.Lenovo.LenovoFactory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author heikki
 */
public class Main {
	public static void main(String[] args) {
		List<ComputerFactory> factories = new ArrayList<>();
		factories.add(new LenovoFactory());
		factories.add(new AppleFactory());

		for (ComputerFactory compfact : factories) {
			System.out.println("");
			System.out.println("Computer from: " + compfact.getClass().getSimpleName());
			System.out.println("");
			Computer computer = compfact.getComputer();
			
			System.out.println(computer);
			System.out.println("");
		}
	}
	
}
