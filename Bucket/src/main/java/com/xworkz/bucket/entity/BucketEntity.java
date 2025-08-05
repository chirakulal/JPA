package com.xworkz.bucket.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
