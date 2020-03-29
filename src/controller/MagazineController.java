package controller;

import model.Magazine;
import model.MagazineDB;

import java.util.ArrayList;
import java.util.Vector;

public class MagazineController {
    MagazineDB magazineDB = new MagazineDB();
    
    public Magazine getMagazine(String mazID) {
        Magazine  magazine = magazineDB.getMagazine(mazID);
        return magazine;
    }

    public Vector<Magazine> getAll() {
        Vector magazines = new Vector();
        ArrayList<Magazine> magazineList = magazineDB.getAll();

        for (Magazine magazine : magazineList) {
            Vector vector = new Vector();
            vector.add(magazine.getMazID());
            vector.add(magazine.getMazTitle());
            vector.add(magazine.getPublisher());
            vector.add(magazine.getPrice());
            magazines.add(vector);
        }

         return magazines;
    }

    public int newMagazine(String mazID, String mazTitle, String publisher, double price) {
        int rc = magazineDB.newMagazine(mazID, mazTitle, publisher, price);
        return rc;
    }
}
