/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Vlad
 */
public class CodFidelizare implements Serializable{
    
    
    private String judet;
    
    private String cod;
    
    
    public CodFidelizare(){}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.judet);
        hash = 73 * hash + Objects.hashCode(this.cod);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CodFidelizare other = (CodFidelizare) obj;
        if (!Objects.equals(this.judet, other.judet)) {
            return false;
        }
        return Objects.equals(this.cod, other.cod);
    }

    
    
    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    
    
    
}
