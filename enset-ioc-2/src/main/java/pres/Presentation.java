package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println("Results="+ metier.calcul());
    }
}
