package com.xworkz.user.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter

@Entity
@Table(name = "user_details")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser_details")
    private int id;

    @Getter
    @Column(name = "user_name")
    private String name;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_mobileNumber")
    private long mobileNumber;

    @Column(name = "user_age")
    private int age;

    @Column(name = "user_gender")
    private String gender;

    public UserEntity() {
    }

    public UserEntity(int id, String name, String email, long mobileNumber, int age, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
