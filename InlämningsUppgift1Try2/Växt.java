package Sprint1.InlämningsUppgift1Try2;

public class Växt {

    //Inkapsling, get och set
    private String namn;

    private double längd;

    private String vätsketyp;

    private double dagligtVätskeintag;

    public Växt(String namn, double längd, String vätsketyp) {
        this.namn = namn;
        this.längd = längd;
        this.vätsketyp = vätsketyp;
    }

    public double getdagligtVätskeintag() {
        return dagligtVätskeintag;
    }

    public void setdagligtVätskeintag(double dagligtVätskeintag) {
        this.dagligtVätskeintag = dagligtVätskeintag;
    }

    public double calculateDagligtIntag(String vätsketyp) {
        if (vätsketyp.equals("Mineralvatten")) {
            this.setdagligtVätskeintag(0.02);
            return this.getdagligtVätskeintag();
        } else if (vätsketyp.equals("Kranvatten")) {
            this.setdagligtVätskeintag(0.5 * längd);
            return this.getdagligtVätskeintag();
        } else if (vätsketyp.equals("Proteindryck")) {
            this.setdagligtVätskeintag(0.1 + (0.2 * längd));
            return this.getdagligtVätskeintag();

        } else {
            System.out.println("error");
        }
        return 0;
    }
}