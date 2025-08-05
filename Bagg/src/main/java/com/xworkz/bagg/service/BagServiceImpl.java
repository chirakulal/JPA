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

    @Override
    public BagEntity getBagEntityById(int id) {
        BagRepo bagRepo = new BagRepoImpl();
        bagRepo.getBagEntityById(id);
        return null;
    }

    @Override
    public boolean updateBagEntityById(int id, String brand) {
        BagRepo bagRepo = new BagRepoImpl();
        bagRepo.updateBagEntityById(id,brand);
        return false;
    }

    @Override
    public void deleteBagEntityById(int id) {
        BagRepo bagRepo = new BagRepoImpl();
        bagRepo.deleteBagEntityById(id);

    }
}
