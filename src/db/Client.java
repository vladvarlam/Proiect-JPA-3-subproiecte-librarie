/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;

/**
 *
 * @author Vlad
 */

@Entity
@IdClass(CodFidelizare.class)
//@GeneratedValue(strategy=IDENTITY)
public class Client implements Serializable{
    
    @Id
    private String cod;
    @Id
    private String judet;

    
    private String nume;
    
    @OneToMany(mappedBy="client", cascade=CascadeType.ALL)
    private ArrayList<Produs> produse;
    
    @ElementCollection(fetch=LAZY)
    private ArrayList<String> telefoane;

    public ArrayList<Produs> getProduse() {
        return produse;
    }

    public void setProduse(List<Produs> produse) {
        this.produse = (ArrayList<Produs>) produse;
    }
    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ArrayList<String> getTelefoane() {
        return telefoane;
    }

    public void setTelefoane(ArrayList<String> telefoane) {
        this.telefoane = telefoane;
    }

    @Override
    public String toString() {
        return "Client{" + "cod=" + cod + ", judet=" + judet + ", nume=" + nume + ", produse=" + produse + ", telefoane=" + telefoane + '}';
    }

    
    
    
    
    
}
