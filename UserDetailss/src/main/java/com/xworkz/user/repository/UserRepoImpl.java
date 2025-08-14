package com.xworkz.user.repository;

import com.xworkz.user.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo{

    public UserRepoImpl(){
        System.out.println("Repo is called....");
    }


    EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("user");


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
}
