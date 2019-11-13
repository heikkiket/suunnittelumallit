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
public class Main {
        
        public static void main(String[] args) {
                System.out.println("Luodaan tallennustila");
                DataStorage storage = new DataStorage();
                System.out.println("Lisätään testidataa");
                storage.add(new SimpleData("Testidata1"));

                System.out.println("Lisätään salattua dataa");
                PasswordProtectedData protected1 = new PasswordProtectedData(
                        "qwerty123", 
                        new SimpleData("TURVALUOKITETTUA tietoa")
                );

                PuzzleProtectedData protected2 = new PuzzleProtectedData(
                        5,
                        new PasswordProtectedData(
                                "salasana",
                                new SimpleData("Kahden lukon takana")
                        )
                );

                storage.add(protected1);
                storage.add(protected2);
                String data = storage.getItem(2).accessData();
                System.out.println("Data on: " + data);
                String data2 = storage.getItem(3).accessData();
                System.out.println("Data on: " + data2);
        }
}
