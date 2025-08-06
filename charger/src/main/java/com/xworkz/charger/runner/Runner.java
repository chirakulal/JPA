package com.xworkz.charger.runner;

import com.xworkz.charger.entity.ChargerEntity;
import com.xworkz.charger.service.ChargerService;
import com.xworkz.charger.service.ChargerServiceImpl;

public class Runner {

    public static void main(String[] args) {
        ChargerEntity charger =new ChargerEntity( "Anker", "Lightning", "Black");
        System.out.println(charger);
        ChargerService chargerService = new ChargerServiceImpl();
        chargerService.save(charger);
    }
}
