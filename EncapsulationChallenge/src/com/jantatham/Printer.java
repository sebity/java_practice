package com.jantatham;

/**
 * Created by jan on 10/03/17.
 */
public class Printer {
    private int tonerLevel;
    private int noOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(this.tonerLevel >= 0 && this.tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }
        this.noOfPagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int addToner(int tonerAmount) {
        if(this.tonerLevel > 0 && this.tonerLevel <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else {
            return -1;
        }
    }

    public void printPage(int pagesPrinted) {
        System.out.println("Checking print ink level...  Printer has " + this.tonerLevel + "% ink left.");

        if(this.tonerLevel <= 0) {
            System.out.println("Printer ink has ran out. Unable to print pages.");
            return;
        }

        this.noOfPagesPrinted += pagesPrinted;
        for (int i = 0; i < pagesPrinted; i++) {
            System.out.println("Printing Page " + (i + 1));
            this.tonerLevel -= 1;
            if (this.tonerLevel <= 15) {
                System.out.println("Printer ink is running low.");
            }
            if(this.tonerLevel <= 0) {
                System.out.println("Printer ink has ran out!!!  Replace ink and press continue.");
                return;
            }
        }

    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
