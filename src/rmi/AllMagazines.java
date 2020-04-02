package rmi;

import model.Magazine;

import java.io.Serializable;
import java.util.Vector;

public class AllMagazines implements Serializable {
    private Vector<Magazine> allMagazines = new Vector<>();

    public AllMagazines() {
    }

    public Vector<Magazine> getAllMagazines() {
        return allMagazines;
    }

    public void setAllMagazines(Vector<Magazine> allMagazines) {
        this.allMagazines = allMagazines;
    }
}
