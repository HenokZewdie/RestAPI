package com.ws.RestAPI.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.util.Scanner;


public class RESTfulClient {

    public static void main(String[] Java4s) {

        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        try {
            String url = "http://localhost:8010/home/employee/E0" + i;
            System.out.println(url);
            Client client = Client.create();
            WebResource resource = client.resource(url);
            ClientResponse response = resource.accept("application/xml").get(ClientResponse.class);

            if(response.getStatus() == 200){

                String output = response.getEntity(String.class);
                System.out.println(output);

            }else System.out.println("Something went wrong..!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}