package com.xworkz.bagg.service;

import com.xworkz.bagg.entity.BagEntity;

public interface BagService {

    void save(BagEntity bag);



    BagEntity getBagEntityById(int id);

    boolean updateBagEntityById(int id,String brand);

    void deleteBagEntityById(int id);
}
