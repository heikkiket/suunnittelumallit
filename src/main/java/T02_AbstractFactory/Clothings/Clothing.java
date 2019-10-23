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
public interface Clothing {
	
	public Shoes getShoes();
	public Cap getCap();
	public Shirt getShirt();
	public Trousers getTrousers();
}
