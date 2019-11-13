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
public class AbstractProtectedData implements AccessableData {

        protected AccessableData dataObject;

        public AbstractProtectedData(AccessableData data) {
                this.dataObject = data;
        }


        @Override
        public String accessData() {
                return dataObject.accessData();
        }
        
}
