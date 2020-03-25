/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.backing;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author marce
 */
@Named(value = "calculateBean")
@RequestScoped
public class CalculateBean {
    
    private Integer liczba1, liczba2, suma;
    private Date data;
    
    /**
     * Creates a new instance of CalculateBean
     */
    public CalculateBean() {
        data = new Date();
    }
    
    public void calculate(){
        suma = liczba1 + liczba2;
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Calculation successful",  "Your expression: "+liczba1+" + "+liczba2+" = "+suma) );
    }

    /**
     * @return the liczba1
     */
    public Integer getLiczba1() {
        return liczba1;
    }

    /**
     * @param liczba1 the liczba1 to set
     */
    public void setLiczba1(Integer liczba1) {
        this.liczba1 = liczba1;
    }

    /**
     * @return the liczba2
     */
    public Integer getLiczba2() {
        return liczba2;
    }

    /**
     * @param liczba2 the liczba2 to set
     */
    public void setLiczba2(Integer liczba2) {
        this.liczba2 = liczba2;
    }

    /**
     * @return the suma
     */
    public Integer getSuma() {
        return suma;
    }

    /**
     * @param suma the suma to set
     */
    public void setSuma(Integer suma) {
        this.suma = suma;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

}
