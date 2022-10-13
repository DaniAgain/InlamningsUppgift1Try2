package Sprint1.InlämningsUppgift1Try2;

//Arv och implementerar interface

public class Kaktusar extends Växt implements Interface {


    public Kaktusar(String namn, double längd, String vätsketyp) {
        super(namn, längd, vätsketyp);
    }

    // Interface implementation
    public void getNamn() {
        System.out.println("namn: Igge");

    }
}