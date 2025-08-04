package com.xworkz.bagg.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Bag")
public class BagEntity {

    @Id
    @Column(name = "idBag")
    private int id;
    private String brand;
    private int price;

    @Column(name = "no_of_zip")
    private int noOfZip;
}