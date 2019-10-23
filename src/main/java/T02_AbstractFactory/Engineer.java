/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T02_AbstractFactory;

import T02_AbstractFactory.Clothings.Clothing;

/**
 *
 * @author heikki
 */
class Engineer {

	private Clothing clothing;

	Engineer(Clothing clothing) {
		this.clothing = clothing;
	}

	void listClothing() {
		
		System.out.println("I am wearing " + clothing.getShirt() + ", " +
		clothing.getTrousers() + ", " +
		clothing.getCap() + " and " +
		clothing.getShoes() + ".");
	}

	void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}


	
}
