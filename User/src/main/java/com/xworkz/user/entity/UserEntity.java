package com.xworkz.user.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.sql.Select;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
@NamedQuery(name= "getAll",query ="select entity from UserEntity entity")
@NamedQuery(name = "getByName" ,query = "select entity from UserEntity entity where firstName= :name")
@NamedQuery(name = "getByNameAndPlace" ,query = "select entity from UserEntity entity where firstName=:name and place= :place")
@NamedQuery(name = "getByNameAndPhone" ,query = "select entity from UserEntity entity where firstName=:name and phoneNumber= :number")
@NamedQuery(name = "getAgeAbove25",query = "select entity from UserEntity entity where age>25")
@NamedQuery(name = "getAgeBetween20And30",query = "select entity from UserEntity entity where age between 20 and 30")
@NamedQuery(name = "getByEmail",query = "select e from UserEntity e where email= :email")
@NamedQuery(name = "getByPhone",query = "select e from UserEntity e where phoneNumber= :phone")

@NamedQuery(name = "getByNameByage",query = "select entity.firstName from UserEntity entity where entity.age = :ageBy")
@NamedQuery(name = "getByNameAndPlaceByAge" ,query = "select entity.firstName , entity.place from UserEntity entity where age = :ageBy")
@NamedQuery(name = "getByNameAndPhoneByPlace" ,query = "select entity.firstName,entity.phoneNumber from UserEntity entity where place = :placeBy")
@NamedQuery(name = "getLastNameAgeAbove25",query = "select entity.lastName from UserEntity entity where   entity.age>25")
@NamedQuery(name = "getPhoneByAgeBetween20And30",query = "select entity.phoneNumber from UserEntity entity where age between 20 and 30")
@NamedQuery(name = "getNameAndPlaceByEmail",query = "select entity.firstName , entity.place from UserEntity entity where email= :emailBy")
@NamedQuery(name = "getEmailByPhone",query = "select entity.email from UserEntity entity where entity.phoneNumber= :phone")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "place")
    private String place;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "gender")
    private String gender;

    public UserEntity(String firstName, String lastName, String place, int age, String email, long phoneNumber, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.place = place;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }


}
