/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author marce
 */
public class Main {

    public static void main(String[] args) {

        Client client = ClientBuilder.newClient();

        String count
                = client.target("http://localhost:8080/Complaints/"
                        + "resources/complaints/count")
                        .request(MediaType.TEXT_PLAIN)
                        .get(String.class);
        System.out.println("Count: " + count);
        client.close();

        // wyświetlenie wszystkich skarg
        List<Complaint> all
                = client.target("http://localhost:8080/Complaints/" + "resources/complaints")
                        .request(MediaType.APPLICATION_JSON)
                        .get(new GenericType<List<Complaint>>() {
                        });
        System.out.println("All complaints: " + all);

        // wyświetlenie wszystkich otwartych skarg
        List<Complaint> allOpened
                = client.target("http://localhost:8080/Complaints/" + "resources/complaints/?status=open")
                        .request(MediaType.APPLICATION_JSON)
                        .get(new GenericType<List<Complaint>>() {
                        });
        System.out.println("All opened complaints: " + allOpened);

    }

}
