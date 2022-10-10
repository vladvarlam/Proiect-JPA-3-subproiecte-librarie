/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;


import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Vlad
 */

@Entity
//@Access(AccessType.FIELD)
public class Produs implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//mai bine cu .table
    private int id;
    

    private String nume;
    

    private double pret;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="ETICHETA_ID_TRANSFER")
    private Eticheta eticheta;

    public Eticheta getEticheta() {
        return eticheta;
    }

    public void setEticheta(Eticheta eticheta) {
        this.eticheta = eticheta;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    @ManyToOne(cascade={CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE})
    //@JoinColumn(name="id_de_produse")
    // fara cacsade mergea la fel exemplul
    private Client client;
    
   // private transient int test;
// merge,nu il mapeaza in tabela
//@Access(AccessType.PROPERTY)
    public int getId() {
        
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" + "id=" + id + ", nume=" + nume + ", pret=" + pret + ", eticheta=" + eticheta + ", client=" +client.getTelefoane()+ client.getNume()+'}';
    }

    
    
}
