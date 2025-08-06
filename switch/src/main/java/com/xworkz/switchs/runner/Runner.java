package com.xworkz.switchs.runner;

import com.xworkz.switchs.entity.SwitchEntity;
import com.xworkz.switchs.service.SwitchService;
import com.xworkz.switchs.service.SwitchServiceImpl;

public class Runner {

    public static void main(String[] args) {
        SwitchEntity switchEntity = new SwitchEntity("er",1000,10);
        System.out.println(switchEntity);
        SwitchService switchService = new SwitchServiceImpl();
        switchService.save(switchEntity);

    }
}
