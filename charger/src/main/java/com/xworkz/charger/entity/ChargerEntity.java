package com.xworkz.charger.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "charger_table")
public class ChargerEntity {

    @Id
    @Column(name = "idcharger_table")
    private int id;
    private String brand;
    private String type;
    private String color;

    public ChargerEntity(String brand, String type, String color) {
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ChargerEntity{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
