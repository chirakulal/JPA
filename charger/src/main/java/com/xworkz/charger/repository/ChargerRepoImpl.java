package com.xworkz.charger.repository;

import com.xworkz.charger.entity.ChargerEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ChargerRepoImpl implements ChargerRepo{
    @Override
    public boolean save(ChargerEntity charger) {
        System.out.println("repo......");
        System.out.println(charger);

        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;

        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("charger");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();
            entityManager.persist(charger);
            entityTransaction.commit();
        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }
        return false;
    }
}
