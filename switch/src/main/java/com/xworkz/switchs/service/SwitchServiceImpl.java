package com.xworkz.switchs.service;

import com.xworkz.switchs.entity.SwitchEntity;
import com.xworkz.switchs.repository.SwitchRepo;
import com.xworkz.switchs.repository.SwitchRepoImpl;

public class SwitchServiceImpl implements SwitchService {
    @Override
    public boolean save(SwitchEntity switchEntity) {

        SwitchRepo switchRepo = new SwitchRepoImpl();
        switchRepo.save(switchEntity);

        return false;
    }
}
