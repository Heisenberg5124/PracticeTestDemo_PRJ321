/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import controller.MagazineController;
import java.awt.HeadlessException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class MagazineServer {
    public static void main(String[] args) {
        AllMagazines allMaz = allMaz = new AllMagazines();
        MagazineController mazController = new MagazineController();
        AllMagazinesImpl allMazImpl;
        
        allMaz.setAllMagazines(mazController.getAll());
        
        try {
            allMazImpl = new AllMagazinesImpl(allMaz);
            LocateRegistry.createRegistry(5001);
            Naming.rebind("rmi://localhost:5001/MagazineServer", allMazImpl);
            System.out.println("Server started!");
        } catch (HeadlessException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
