import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(1000);
    }

    @Test
    public void hasSheetsLeft(){
        int sheetsLeft = printer.getSheetsLeft();
        assertEquals(1000, sheetsLeft);
    }

    @Test
    public void canPrint(){
        printer.print(10, 20);
        assertEquals(800, printer.getSheetsLeft());
        assertEquals(1800, printer.getTonerVolume());
    }

    @Test
    public void notEnoughSheets(){
        printer.print(100, 100);
        assertEquals(1000, printer.getSheetsLeft());
    }

    @Test
    public void notEnoughToner(){
        printer.print(100, 100);
        assertEquals(2000, printer.getTonerVolume());
    }

    @Test
    public void canRefill(){
        printer.refill();
        assertEquals(1500, printer.getSheetsLeft());
    }

    @Test
    public void hasToner(){
        int tonerVolume = printer.getTonerVolume();
        assertEquals(2000, tonerVolume);
    }

}
