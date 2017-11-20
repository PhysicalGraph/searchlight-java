package com.smartthings.searchlight.runner;

import com.smartthings.searchlight.model.Bot;
import com.smartthings.searchlight.persistence.BotRepository;
import com.smartthings.searchlight.persistence.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class AppStartRunner implements CommandLineRunner {

    private final BotRepository mBotRepository;
    private final DeviceRepository mDeviceRepository;

    //@Autowired
    public AppStartRunner(BotRepository botRepository, DeviceRepository deviceRepository) {
        mBotRepository = botRepository;
        mDeviceRepository = deviceRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.mBotRepository.save(new Bot("Yo", "Mama", "1234", true, true));
    }
}