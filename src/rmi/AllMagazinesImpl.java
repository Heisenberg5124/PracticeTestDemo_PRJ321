package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AllMagazinesImpl extends UnicastRemoteObject implements IMagazine {
    AllMagazines allMagazines;

    public AllMagazinesImpl(AllMagazines allMagazines) throws RemoteException {
        this.allMagazines = allMagazines;
    }

    @Override
    public AllMagazines getAllMagazines() throws RemoteException {
        return allMagazines;
    }
}
