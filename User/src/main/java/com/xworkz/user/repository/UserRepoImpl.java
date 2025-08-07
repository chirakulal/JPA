package com.xworkz.user.repository;

import com.xworkz.user.entity.UserEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class UserRepoImpl implements UserRepo{


    @Override
    public boolean save(List<UserEntity> userEntities) {
        System.out.println("Repo..........");

        System.out.println(userEntities);

        EntityManagerFactory  entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;

        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("user");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();
            for(UserEntity user:userEntities){
                entityManager.persist(user);
            }
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

    @Override
    public List<UserEntity> findAll() {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
       List<UserEntity> user = null;

        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("user");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();

          Query query = entityManager.createNamedQuery("getAll");
         user= query.getResultList();
        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }



        return user;
    }

    @Override
    public List<UserEntity> getUserEntityByName(String firstname) {
        System.out.println(firstname);
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        List<UserEntity> user = null;

        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("user");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();

            Query query = entityManager.createNamedQuery("getByName");
            query.setParameter("name",firstname);
            user= query.getResultList();
            System.out.println(user);
            entityTransaction.commit();
        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }

        return user;
    }



    @Override
    public List<UserEntity> getUserEntityByNameAndPlace(String firstname, String place) {
        System.out.println(firstname+" "+place);
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        List<UserEntity> user = null;

        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("user");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();

            Query query = entityManager.createNamedQuery("getByNameAndPlace");
            query.setParameter("name",firstname);
            query.setParameter("place",place);
            user= query.getResultList();
            System.out.println(user);
            entityTransaction.commit();
        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }

        return user;
    }

    @Override
    public List<UserEntity> getUserEntityByNameAndPhone(String firstname, String phone) {
        System.out.println(firstname+" "+phone);
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        List<UserEntity> user = null;

        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("user");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();

            Query query = entityManager.createNamedQuery("getByNameAndPhone");
            query.setParameter("name",firstname);
            query.setParameter("number",phone);
            user= query.getResultList();
            entityTransaction.commit();

        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }


        return user;
    }



    @Override
    public List<UserEntity> getByAge() {
        System.out.println("Repo....");
        EntityManagerFactory factory=null;
        EntityManager manager=null;
        EntityTransaction transaction=null;
        List<UserEntity> userEntities=null;
        try{
            factory = Persistence.createEntityManagerFactory("user");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query=manager.createNamedQuery("getAgeAbove25");
            userEntities= query.getResultList();

            transaction.commit();




        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            manager.close();
        }
        return userEntities;
    }

    @Override
    public List<UserEntity> getAgeBetween() {
        System.out.println("Repo....");
        EntityManagerFactory factory=null;
        EntityManager manager=null;
        EntityTransaction transaction=null;
        List<UserEntity> userEntities=null;
        try{
            factory = Persistence.createEntityManagerFactory("user");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query=manager.createNamedQuery("getAgeBetween20And30");
            userEntities= query.getResultList();

            transaction.commit();




        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            manager.close();
        }
        return userEntities;

    }

    @Override
    public UserEntity getByEmail(String email) {
        System.out.println("Repo....");
        EntityManagerFactory factory=null;
        EntityManager manager=null;
        EntityTransaction transaction=null;
        UserEntity userEntities=null;
        try{
            factory = Persistence.createEntityManagerFactory("user");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query=manager.createNamedQuery("getByEmail");
            query.setParameter("email",email);
            userEntities=(UserEntity) query.getSingleResult();
            System.out.println(userEntities);

            transaction.commit();




        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            manager.close();
        }
        return userEntities;


    }

    @Override
    public UserEntity getByPhone(long phone) {
        System.out.println("Repo....");
        EntityManagerFactory factory=null;
        EntityManager manager=null;
        EntityTransaction transaction=null;
        UserEntity userEntities=null;
        try{
            factory = Persistence.createEntityManagerFactory("user");
            manager = factory.createEntityManager();
            transaction = manager.getTransaction();

            transaction.begin();

            Query query=manager.createNamedQuery("getByPhone");
            query.setParameter("phone",phone);
            userEntities=(UserEntity) query.getSingleResult();
            System.out.println(userEntities);

            transaction.commit();




        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            manager.close();
        }
        return userEntities;
    }
}
