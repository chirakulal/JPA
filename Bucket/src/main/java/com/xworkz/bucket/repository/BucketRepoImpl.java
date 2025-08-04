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
}
