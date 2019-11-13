/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T06_Decorator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author heikki
 */
public class DataStorage {

        private List<AccessableData> storage;

        public DataStorage() {
                this.storage = new ArrayList<>();
        }

        public void add(AccessableData dataObj) {
                storage.add(dataObj);
        }

        public AccessableData getItem(int id) {
                id = id - 1;
                if (id < 0 || id > storage.size() - 1) {
                        return null;
                }
                return storage.get(id);
        }
       
}
