package com.xworkz.switchs.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "switch_table")
public class SwitchEntity {

    @Id
    @Column(name = "idswitch_table")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "switch_brand")
    private String brand;

    @Column(name = "switch_price")
    private int price;

    @Column(name = "no_of_switch")
    private int noOfSwitch;

    public SwitchEntity(String brand, int price, int noOfSwitch) {
        this.brand = brand;
        this.price = price;
        this.noOfSwitch = noOfSwitch;
    }

    @Override
    public String toString() {
        return "SwitchEntity{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", noOfSwitch=" + noOfSwitch +
                '}';
    }
}
