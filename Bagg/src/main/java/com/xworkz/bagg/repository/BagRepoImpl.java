package com.xworkz.bagg.repository;

import com.xworkz.bagg.entity.BagEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BagRepoImpl implements BagRepo {

    @Override
    public void save(BagEntity bag) {
        System.out.println("Repo.....");
        System.out.println(bag);

        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction =null;

        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("bag");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();
            entityManager.persist(bag);
            entityTransaction.commit();
        }catch (Exception e){
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        } finally {
            entityManager.close();
        }

    }
}
