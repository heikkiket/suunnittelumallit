/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T02_AbstractFactory.Clothings;

/**
 *
 * @author heikki
 */
public abstract class AbstractCloth {
	
	protected String name;

	@Override
	public String toString() {
		return this.name;
	}
}
