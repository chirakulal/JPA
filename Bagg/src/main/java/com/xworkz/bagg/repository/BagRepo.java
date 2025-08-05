package com.xworkz.bagg.repository;

import com.xworkz.bagg.entity.BagEntity;

public interface BagRepo {

    void save(BagEntity bag);

    BagEntity getBagEntityById(int id);

    boolean updateBagEntityById(int id,String brand);

    void deleteBagEntityById(int id);

}
