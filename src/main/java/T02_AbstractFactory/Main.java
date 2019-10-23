/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T02_AbstractFactory;

import T02_AbstractFactory.Clothings.Clothing;
import T02_AbstractFactory.Clothings.Adidas.AdidasClothing;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author heikki
 */
public class Main {
	
	public static void main(String[] args) {
		
		Engineer jasper = new Engineer(new AdidasClothing());
		jasper.listClothing();

		//jasper.setClothing(new BossClothing());
		try {
			
			Clothing c = (Clothing) Class.forName("T02_AbstractFactory.Clothings.Boss.BossClothing").newInstance();
			jasper.setClothing(c);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
		jasper.listClothing();
	}
}
