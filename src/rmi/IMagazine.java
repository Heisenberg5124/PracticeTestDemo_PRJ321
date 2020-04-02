package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMagazine extends Remote {
    AllMagazines getAllMagazines() throws RemoteException;
}
