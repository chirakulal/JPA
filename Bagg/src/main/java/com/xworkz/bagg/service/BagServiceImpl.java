package com.xworkz.bagg.service;

import com.xworkz.bagg.entity.BagEntity;
import com.xworkz.bagg.repository.BagRepo;
import com.xworkz.bagg.repository.BagRepoImpl;

public class BagServiceImpl implements BagService{
    @Override
    public void save(BagEntity bagEntity) {
        System.out.println(bagEntity);
        BagRepo bagRepo = new BagRepoImpl();
        bagRepo.save(bagEntity);
    }
}
