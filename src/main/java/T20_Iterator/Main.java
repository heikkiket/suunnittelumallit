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
public class Main {

    public static void main(String[] args) {
       
        Collection c1 = new ArrayList<String>();

        c1.add("foo");
        c1.add("bar");
        c1.add("baz");

        // Kaksi säiettä omilla iteraattoreilla, käy molemmat kokoelmat 
        // yksi kerrallaan läpi:
        Aggregate a1 = new Aggregate(c1, "a1");
        Aggregate a2 = new Aggregate(c1, "a2");
        a1.start();
        a2.start();

    }
    
}
