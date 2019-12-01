/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T18_Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author heikki
 */
public class Main {
    public static void main(String[] args) {
        Clock clock1 = new Clock(13, 37);
        Clock clock2;
        clock2 = (Clock) clock1.clone();
        clock1.advance();
        System.out.println(clock1);
        
        clock2.advance();
        //Should print: 13.38
        clock1.advance();
        System.out.println(clock2);
    }
 
}
