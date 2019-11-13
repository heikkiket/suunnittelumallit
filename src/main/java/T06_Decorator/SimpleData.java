/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T06_Decorator;

/**
 *
 * @author heikki
 */
public class SimpleData implements AccessableData {

        private final String data;

        public SimpleData(String data) {
                this.data = data;
        }

         
        @Override
        public String accessData() {

                return this.data;
        }
        
}
