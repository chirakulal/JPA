package com.xworkz.user.repository;

import com.xworkz.user.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo{

    public UserRepoImpl(){
        System.out.println("Repo is called....");
    }


    EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("users");


    @Override
    public boolean validateAndSave(UserEntity user) {
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;


        System.out.println("Repo.........");
        System.out.println(user.toString());

        try {
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction =entityManager.getTransaction();

            entityTransaction.begin();

            entityManager.persist(user);

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
    public List<UserEntity> getAllData() {


        EntityManager entityManager = null;
        EntityTransaction entityTransaction =null;
        List<UserEntity> userEntities = null;

        try{
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();

            entityTransaction.begin();

          Query query= entityManager.createNamedQuery("getAllData");
          userEntities =query.getResultList();

            System.out.println(userEntities);

          entityTransaction.commit();

        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }


        return userEntities;
    }

    @Override
    public UserEntity getById(int id) {

        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        UserEntity user = null;
        try{
           entityManager=entityManagerFactory.createEntityManager();
           entityTransaction=entityManager.getTransaction();

           entityTransaction.begin();

          Query query = entityManager.createNamedQuery("getById");
          query.setParameter("idBy",id);
         user=(UserEntity) query.getSingleResult();

         entityTransaction.commit();
        }catch (Exception e){
            if(entityTransaction.isActive());
            entityTransaction.rollback();
        }finally {
            entityManager.close();
        }

        return user;
    }

    @Override
    public boolean UpdateById(int id, String name) {
        EntityManager entityManager =null;
        EntityTransaction entityTransaction=null;

        try {
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();

            entityTransaction.begin();
          UserEntity user=  entityManager.find(UserEntity.class,id);
          user.setName(name);
          entityManager.merge(user);

          entityTransaction.commit();

          return true;

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
    public boolean DeletedById(int id) {
        EntityManager entityManager =null;
        EntityTransaction entityTransaction=null;

        try{
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();

            entityTransaction.begin();

       UserEntity user=     entityManager.find(UserEntity.class,id);
          entityManager.remove(user);
          entityTransaction.commit();
          return true;

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
    public List<String> getEmailWithPattern() {
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        List<String> email =null;

        try {
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();

            entityTransaction.begin();

           Query query = entityManager.createNamedQuery("getEmailWithPattern");
         email =   query.getResultList();

         entityTransaction.commit();


        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }

        return email;
    }

    @Override
    public UserEntity getNameAndEmailByPhone(long mobileNumber) {

        System.out.println(mobileNumber);

        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        UserEntity user = new UserEntity();

        try{
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();

            entityTransaction.begin();

          Query query =  entityManager.createNamedQuery("getNameAndEmailByPhone");
          query.setParameter("mobileBy",mobileNumber);
         Object[] objects =(Object[]) query.getSingleResult();

        user.setName((String) objects[0]);
          user.setEmail((String) objects[1]);



          entityTransaction.commit();
            System.out.println(user.getEmail());
            System.out.println(user.getName());

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
    public List<UserEntity> getNameEmailPhoneByAgeAbove() {
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        List<UserEntity> user = new ArrayList<>();

        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();

            entityTransaction.begin();

            Query query =  entityManager.createNamedQuery("getNameEmailPhoneByAgeAbove");
           List<Object[]> objects = query.getResultList();
           for (Object[] objects1: objects) {
               UserEntity user1 = new UserEntity();
               user1.setName((String) objects1[0]);
               user1.setEmail((String) objects1[1]);
               user1.setMobileNumber((Long) objects1[2]);

               user.add(user1);
           }


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
}
