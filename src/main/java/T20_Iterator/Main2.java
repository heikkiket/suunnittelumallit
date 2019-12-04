/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T20_Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author heikki
 */
public class Main2 {

    public static void main(String[] args) {
       
        Collection c1 = new ArrayList<String>();

        c1.add("foo");
        c1.add("bar");
        c1.add("baz");

        // Kaksi säiettä yhteisellä iteraattorilla, palauttaa aina null:
        Iterator iter = c1.iterator();

        Aggregate2 a3 = new Aggregate2(c1, iter, "a3");
        Aggregate2 a4 = new Aggregate2(c1, iter, "a4");
        a3.start();
        a4.start();
    }
    
}
