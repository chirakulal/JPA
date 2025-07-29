package com.xworkz.luggage.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Runner {

    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("Xworkz");
       if(emf!=null){
           System.out.println("This is continued.......");
       }
    }
}
