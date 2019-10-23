/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T02_AbstractFactory.Clothings.Adidas;

import T02_AbstractFactory.Clothings.Cap;
import T02_AbstractFactory.Clothings.Clothing;
import T02_AbstractFactory.Clothings.Shirt;
import T02_AbstractFactory.Clothings.Shoes;
import T02_AbstractFactory.Clothings.Trousers;

/**
 *
 * @author heikki
 */
public class AdidasClothing implements Clothing {

	public AdidasClothing() {
	}

	@Override
	public Shoes getShoes() {
		return new AdidasShoes();
	}

	@Override
	public Cap getCap() {
		return new AdidasCap();
	}

	@Override
	public Shirt getShirt() {
		return new AdidasShirt();
	}

	@Override
	public Trousers getTrousers() {
		return new AdidasJeans();
	}
	
}
