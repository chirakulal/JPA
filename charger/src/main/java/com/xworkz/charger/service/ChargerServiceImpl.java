package com.xworkz.charger.service;

import com.xworkz.charger.entity.ChargerEntity;
import com.xworkz.charger.repository.ChargerRepo;
import com.xworkz.charger.repository.ChargerRepoImpl;

public class ChargerServiceImpl implements ChargerService{


    @Override
    public boolean save(ChargerEntity charger) {

        ChargerRepo chargerRepo = new ChargerRepoImpl();
        chargerRepo.save(charger);

        return false;
    }
}
