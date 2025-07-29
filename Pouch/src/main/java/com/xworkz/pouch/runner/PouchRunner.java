package com.xworkz.pouch.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PouchRunner {

    public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("Xworkz");
      if(emf!=null){
          System.out.println("This is continued....");
      }

    }
}
