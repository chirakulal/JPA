package com.xworkz.bagg.repository;

import com.xworkz.bagg.entity.BagEntity;
import org.hibernate.mapping.Bag;

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
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("bag");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();
            entityManager.persist(bag);
            entityTransaction.commit();
        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        } finally {
            entityManager.close();
        }

    }

    @Override
    public BagEntity getBagEntityById(int id) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        BagEntity bagEntity = null;

        try {

            entityManagerFactory = Persistence.createEntityManagerFactory("bucket");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            bagEntity = entityManager.find(BagEntity.class, id);
            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }

        } finally {
            entityManagerFactory.close();

        }


        return bagEntity;
    }

    @Override
    public boolean updateBagEntityById(int id, String brand) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        BagEntity bagEntity = null;

        try {

            entityManagerFactory = Persistence.createEntityManagerFactory("bucket");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            bagEntity = entityManager.find(BagEntity.class, id);
            bagEntity.setBrand(brand);
            entityTransaction.commit();
            return true;

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }

        } finally {
            entityManagerFactory.close();

        }
        return false;
    }

    @Override
    public void deleteBagEntityById ( int id){
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        BagEntity bagEntity=null;

        try {

            entityManagerFactory= Persistence.createEntityManagerFactory("bucket");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            bagEntity=entityManager.find(BagEntity.class,id);
            entityManager.remove(bagEntity);
            entityTransaction.commit();


        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }

        }finally {
            entityManagerFactory.close();

        }


        }
    }

