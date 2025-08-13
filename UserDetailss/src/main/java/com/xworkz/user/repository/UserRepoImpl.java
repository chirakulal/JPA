package com.xworkz.user.repository;

import com.xworkz.user.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class UserRepoImpl implements UserRepo{


    @Override
    public boolean validateAndSave(UserEntity user) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("user");
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
}
