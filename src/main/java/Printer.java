public class Printer {

    private int sheetsLeft;
    private int tonerVolume;


    public Printer(int sheetsLeft){
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = 2000;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public void print(int pages, int copies){
        int printing = pages * copies;
        if(printing <= this.sheetsLeft && printing <= this.tonerVolume){
          this.sheetsLeft -= printing;
          this.tonerVolume -= printing;
        }
    }

    public void refill(){
        this.sheetsLeft = 1500;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }
}
