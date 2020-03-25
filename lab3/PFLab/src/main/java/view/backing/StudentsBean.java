/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.backing;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author marce
 */
@Named(value = "studentsBean")
@RequestScoped
public class StudentsBean {
    
    private List<AverageBean> students;

    /**
     * Creates a new instance of StudentsBean
     */

    public StudentsBean() {     
        this.students = new ArrayList<>();
        students.add(new AverageBean("magda","nowak",4.57));
        students.add(new AverageBean("oskar","oleszak",3.27));
        students.add(new AverageBean("michalina","misiorna",3.90));
        students.add(new AverageBean("anna","przybylska",4.23));
        students.add(new AverageBean("wojtek","guzik",3.76));
        students.add(new AverageBean("jan","kowalski",3.55)); 
    }   
    
    /**
     * @return the students
     */
    public List<AverageBean> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<AverageBean> Students) {
        this.students = Students;
    }
    
}
