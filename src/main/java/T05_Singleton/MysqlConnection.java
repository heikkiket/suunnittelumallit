/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T05_Singleton;

import java.util.Random;

/**
 *
 * @author heikki
 */
public class MysqlConnection {

        private static MysqlConnection connection;
        private int id;
        
        private MysqlConnection() {

                this.id = new Random().nextInt();

        }


        // Yksinkertainen säieturvallinen toteutus:
        public static synchronized MysqlConnection getInstance() {
                if (connection == null) {
                        connection = new MysqlConnection();
                }

                return connection;
        }

        public void useConnection() {
                System.out.println("Using database connection number " + id);
        }
        
}
