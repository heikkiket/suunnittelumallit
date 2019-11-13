/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T05_Singleton;

/**
 *
 * @author heikki
 */
public class Main {
        
        public static void main(String[] args) {

                MysqlConnection conn1 = MysqlConnection.getInstance();
                conn1.useConnection();

                MysqlConnection conn2 = MysqlConnection.getInstance();
                conn2.useConnection();

        }
}
