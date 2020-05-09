/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author marce
 */
class Complaint {    
    
    private Integer id;
    private String complaintDate;
    private String complaintText;
    private String author;
    private String status;

    public Complaint() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComplaintDate() {
        return complaintDate;
    }

    public void setComplaintDate(String complaintDate) {
        this.complaintDate = complaintDate;
    }

    public String getComplaintText() {
        return complaintText;
    }

    public void setComplaintText(String complaintText) {
        this.complaintText = complaintText;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "---Complaint[" + id + "]---\n"
                + "\tauthor:\t" + author + "\n"
                + "\tdate:\t" + complaintDate+ "\n"
                + "\ttext:\t" + complaintText + "\n"
                + "\tstatus:\t" + status + "\n";

    }
    
}
