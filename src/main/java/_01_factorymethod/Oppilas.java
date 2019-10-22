/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01_factorymethod;

/**
 *
 * @author heikki
 */
public class Oppilas extends AterioivaOtus {

	public Oppilas() {
	}

	@Override
	public Juoma createJuoma() {
		return new Olut();
	}
	
}
