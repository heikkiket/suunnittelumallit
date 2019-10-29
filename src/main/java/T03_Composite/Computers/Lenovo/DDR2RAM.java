/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T03_Composite.Computers.Lenovo;

import T03_Composite.Laiteosa;

/**
 *
 * @author heikki
 */
public class DDR2RAM implements Laiteosa {

	public DDR2RAM() {
	}

	@Override
	public double getPrice() {
		return 60;
	}
	
}
