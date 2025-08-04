package com.xworkz.bagg.runner;

import com.xworkz.bagg.entity.BagEntity;
import com.xworkz.bagg.service.BagService;
import com.xworkz.bagg.service.BagServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        System.out.println("............");
      BagEntity bagEntity = new BagEntity(1,"sky",900,5);
            System.out.println(bagEntity);
            BagService bagService = new BagServiceImpl();
            bagService.save(bagEntity);

    }
}
