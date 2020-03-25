/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.backing;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author marce
 */
@Named(value = "averageBean")
@RequestScoped
public class AverageBean {
    
    private String imie, nazwisko;
    private double srednia;

    /**
     * Creates a new instance of AverageBean
     */
    public AverageBean(String Imie, String Nazwisko, double Srednia) {
        this.imie = Imie;
        this.nazwisko = Nazwisko;
        this.srednia = Srednia;
    }
    
    /**
     * @return the imie
     */
    public String getImie() {
        return imie;
    }

    /**
     * @param imie the imie to set
     */
    public void setImie(String Imie) {
        this.imie = Imie;
    }

    /**
     * @return the nazwisko
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * @param nazwisko the nazwisko to set
     */
    public void setNazwisko(String Nazwisko) {
        this.nazwisko = Nazwisko;
    }

    /**
     * @return the srednia
     */
    public double getSrednia() {
        return srednia;
    }

    /**
     * @param srednia the srednia to set
     */
    public void setSrednia(double Srednia) {
        this.srednia = Srednia;
    }
    
}
