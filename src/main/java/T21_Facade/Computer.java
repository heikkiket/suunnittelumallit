package T21_Facade;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Complex parts */

class CPU {

    private Memory ram;
    private int position;
    private static final byte terminator = '\0';
    private final Display display;

    public CPU(Memory ram, Display display) {
        this.ram = ram;
        this.display = display;
    }

    public void freeze() throws InterruptedException {
        System.out.println("Processor freezed");
        Thread.sleep(500);
    }

    public void jump(long position) throws InterruptedException {
        this.position = (int) position;
        System.out.println("Jumped to position " + position);
        Thread.sleep(500);
    }

    public void execute() throws InterruptedException {
        System.out.println("Executing program from position " + this.position);
        byte b = ram.readMemory(position);
        while(b != terminator) {

            display.show(b);
            Thread.sleep(200);
            b = readNext();
        } 
    }

    private byte readNext() {
        position++;
        return ram.readMemory(position);
    }
}

class HardDrive {

    private byte[] contents;

    public HardDrive() throws IOException {
            byte[] termArray = {'\0'};
            byte[] contentArray = "boot_loader MICRoKERNEL program".getBytes();
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            stream.write(contentArray);
            stream.write(termArray);
            contents = stream.toByteArray();

    }

    public byte[] read(long lba, int size) throws InterruptedException {

        byte[] series = new byte[size];
        int j = 0;
        int address = (int) lba;

        System.out.print("Reading from hard drive");
        for(int i = address; i < size; i++) {
            series[j] = contents[i];
            j++;
            System.out.print(".");
            System.out.flush();
            
            Thread.sleep(1000);
        }
        System.out.println("");
        return series;
    }
}

class Display {
    public void show(byte c) {
        System.out.print((char) c);
        System.out.flush();
    }
}

class Memory {

    private byte[] contents;

    public Memory() {
        this.contents = new byte[30];
    }

    private boolean correctAddress(int i) {
        if (i < 0) {
            System.out.println("MALFORMED ADDRESS");
            return false;
        } else if(i > contents.length) {
            System.out.println("Stack overflow");
            return false;
        }
        return true;
    }

    private void writeToMemory(int i, byte c) {
        if(correctAddress(i)) {
            contents[i] = c;
        }
    }

    public byte readMemory(int i) {
        if(correctAddress(i)) {
            return contents[i];
        }
        return 0;
    }


    public void load(long position, byte[] data) throws InterruptedException {
        for (int i = (int) position; i < data.length; i++) {
            writeToMemory(i, data[i]);
            Thread.sleep(100);
        }
    }
}

