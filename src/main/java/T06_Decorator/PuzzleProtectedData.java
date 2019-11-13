/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T06_Decorator;

import java.util.Random;

/**
 *
 * @author heikki
 */
public class PuzzleProtectedData extends AbstractProtectedData{
        
        private int range;

        public PuzzleProtectedData(int range, AccessableData data) {
                super(data);
                this.range = range;
        }

        public String accessData() {
                int number = new Random().nextInt(range) + 1;
                int guess = Reader.gi().readInt("Anna luku väliltä 1-" + range + " (vihje: oikea luku on " + number + ")");
                if (guess == number) {
                        System.out.println("Arvasit oikein!");
                        return super.accessData();
                }
                System.out.println("VÄÄRIN!");
                System.out.println("Oikea luku oli " + number);
                return "";
        }
        
}
