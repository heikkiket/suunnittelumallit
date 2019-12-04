/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T21_Facade;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author heikki
 */
/* Facade */
public class ComputerFacade {

    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;
    private final Display display;


    public ComputerFacade() {
        this.ram = new Memory();
        this.display = new Display();
        this.processor = new CPU(this.ram, this.display);
        try {
            this.hd = new HardDrive();
        } catch (Exception ex) {
            this.hd = null;
            Logger.getLogger(ComputerFacade.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void start() {
        int BOOT_ADDRESS = 0;
        int BOOT_SECTOR = 0;
        int SECTOR_SIZE = 11; 

        try {
            System.out.println("Starting Micro Mikko 8000");
            Thread.sleep(2000);
            System.out.println("BEEP");
            Thread.sleep(2000);
            processor.freeze();
            ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
            processor.jump(BOOT_ADDRESS);
            processor.execute();
        } catch(Exception e) {
            System.out.println("");
            System.out.println(e.getMessage());
        }
    }
}
