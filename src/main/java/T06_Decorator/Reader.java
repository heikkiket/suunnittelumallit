/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T06_Decorator;

import java.util.Scanner;

/**
 *
 * @author heikki
 */
public class Reader {
       private static Reader INSTANCE; 
       private Scanner s;

       private Reader() {
               s = new Scanner(System.in);
       }

       public static Reader getInstance() {
               if (INSTANCE == null) {
                       INSTANCE = new Reader();
               }

               return INSTANCE;
       }

       public static Reader gi() {
               return getInstance();
       }

       public String read(String message) {
               System.out.println(message);
               return s.nextLine();
       }

        int readInt(String message) {
                return Integer.parseInt(read(message));
        }

       
}


