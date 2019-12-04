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
public class Main3 {

    public static void main(String[] args) {
       
        Collection c1 = new ArrayList<String>();

        c1.add("foo");
        c1.add("bar");
        c1.add("baz");

        Iterator iter = c1.iterator();

        // Läpikäynti iteraattorin kanssa samalla kokoelmaa muunnellen
        // heittää virheen:
        while(iter.hasNext()) {
            System.out.println(iter.next());
            c1.add("new");
        }

    }
    
}
