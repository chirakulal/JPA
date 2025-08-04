package com.xworkz.bucket.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Bucket")
public class BucketEntity {

    @Id
    private int id;
    @Column(name = "quantity")
    private int quantity;
    private String material;
    private String brand;
}
