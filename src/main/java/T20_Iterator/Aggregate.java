/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T20_Iterator;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author heikki
 */
public class Aggregate extends Thread {

    private Collection c;
    private String name;

    public Aggregate(Collection c, String name) {
        this.c = c;
        this.name = name;
    }


    public void run() {
        Iterator iter = c.iterator();

        try {
        while(iter.hasNext()) {
            System.out.println(this.name + ": " + iter.next());
            Thread.sleep(20);
        }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    
}
