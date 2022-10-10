/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmi;
import db.Client;
import db.Produs;
import java.rmi.Remote;
import java.util.List;
import java.rmi.RemoteException;
/**
 *
 * @author Vlad
 */
public interface IMainService extends Remote{
    public List<Produs> getAll()throws RemoteException;
    public void stergeProdusId(int Id)throws RemoteException;
    public void modificaProdus(int Id,String nume, double pret)throws RemoteException;
    public void adaugaClientPro(Client client)throws RemoteException;
}
