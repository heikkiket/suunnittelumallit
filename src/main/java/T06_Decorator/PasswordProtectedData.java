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
public class PasswordProtectedData extends AbstractProtectedData {

        private final String password;
        
        public PasswordProtectedData(String password, AccessableData data) {
                super(data);
                this.password = password;
        }

        @Override
        public String accessData() {
                String givenpw = Reader.gi().read("Anna salasana:");
                if (givenpw.equals(password)) {
                        return super.accessData();
                }

                return "PÄÄSY EVÄTTY";
        }
}
