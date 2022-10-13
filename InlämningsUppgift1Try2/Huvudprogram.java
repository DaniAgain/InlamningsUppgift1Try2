package Sprint1.InlämningsUppgift1Try2;

import javax.swing.*;

public class Huvudprogram {
    public static void main(String[] args) {

//Polymorfism
        Växt kaktusenIgge = new Kaktusar("Igge", 0.2, "Mineralvatten");
        kaktusenIgge.calculateDagligtIntag("Mineralvatten");

        Växt palmenLaura = new Palmer("Laura", 5, "Kranvatten");
        palmenLaura.calculateDagligtIntag("Kranvatten");

        Växt palmenPutte = new Palmer("Putte", 1, "Kranvatten");
        palmenPutte.calculateDagligtIntag("Kranvatten");

        Växt köttätandeVäxtenMeatloaf = new KöttätandeVäxter("Meatloaf", 0.7, "Proteindryck");
        köttätandeVäxtenMeatloaf.calculateDagligtIntag("Proteindryck");


        String växtNamn = JOptionPane.showInputDialog(null, "Välkommen till Hotell Green!\nVilken växt ska få vätska?");


        if (växtNamn.equalsIgnoreCase("Igge")) {
            kaktusenIgge.calculateDagligtIntag("Mineralvatten");
            System.out.println(kaktusenIgge.calculateDagligtIntag("Mineralvatten"));

            JOptionPane.showMessageDialog(null, "Kaktusen Igge skall vattnas med " +
                    (kaktusenIgge.calculateDagligtIntag("Mineralvatten")) + " Liter mineralvatten");
        } else if (växtNamn.equalsIgnoreCase("Laura")) {

            palmenLaura.calculateDagligtIntag("Kranvatten");
            System.out.println(palmenLaura.calculateDagligtIntag("Kranvatten"));

            JOptionPane.showMessageDialog(null, "Palmen Laura skall vattnas med " +
                    (palmenLaura.calculateDagligtIntag("Kranvatten")) + " Liter kranvatten");
        } else if (växtNamn.equalsIgnoreCase("Putte")) {

            palmenPutte.calculateDagligtIntag("Kranvatten");
            System.out.println(palmenPutte.calculateDagligtIntag("Kranvatten"));

            JOptionPane.showMessageDialog(null, "Palmen Putte skall vattnas med " +
                    (palmenPutte.calculateDagligtIntag("Kranvatten") + " Liter kranvatten"));

        } else if (växtNamn.equalsIgnoreCase("Meatloaf")) {

            köttätandeVäxtenMeatloaf.calculateDagligtIntag("Proteindryck");
            System.out.println(köttätandeVäxtenMeatloaf.calculateDagligtIntag("Proteindryck"));

            JOptionPane.showMessageDialog(null, "Köttätandeväxten Meatloaf skall vattnas med " +
                    (köttätandeVäxtenMeatloaf.calculateDagligtIntag("Proteindryck") + " Liter proteindryck"));

        } else {

            JOptionPane.showMessageDialog(null, "Växten finns tyvärr inte hos oss");
        }
    }
}