package com.xworkz.bucket.repository;

import com.xworkz.bucket.entity.BucketEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BucketRepoImpl implements BucketRepo{
    @Override
    public void save(BucketEntity bucketEntity) {

        System.out.println("Repo is created...");
        System.out.println(bucketEntity);
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;

        if (bucketEntity != null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("bucket");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            try {
                entityTransaction.begin();
                entityManager.persist(bucketEntity);
                System.out.println("data have been saved to database");
                entityTransaction.commit();

            } catch (Exception e) {
                if (entityTransaction.isActive()) {
                    entityTransaction.rollback();
                }
            } finally {
                entityManager.close();
            }
        }else
            System.out.println("nullllll");
    }

    @Override
    public BucketEntity getBucketEntityById(int id) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        BucketEntity bucketEntity=null;

        try {

            entityManagerFactory= Persistence.createEntityManagerFactory("bucket");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            bucketEntity=entityManager.find(BucketEntity.class,id);
            entityTransaction.commit();

        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }

        }finally {
            entityManagerFactory.close();

        }


        return bucketEntity;
    }

    @Override
    public boolean uodateBucketEntityById(int id, String material) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        BucketEntity bucketEntity=null;

        try {

            entityManagerFactory= Persistence.createEntityManagerFactory("bucket");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            bucketEntity=entityManager.find(BucketEntity.class,id);
            bucketEntity.setMaterial(material);
            entityTransaction.commit();
            return  true;

        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }

        }finally {
            entityManagerFactory.close();

        }


        return false;
    }

    @Override
    public void deleteBucketEntityById(int id) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        BucketEntity bucketEntity=null;

        try {

            entityManagerFactory= Persistence.createEntityManagerFactory("bucket");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            bucketEntity=entityManager.find(BucketEntity.class,id);
            entityManager.remove(bucketEntity);
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
