package com.smartthings.searchlight.service;

import java.util.List;

import com.smartthings.searchlight.persistence.BotRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartthings.searchlight.model.Bot;

/**
 * Created by david on 11/6/17.
 */
@Service("botService")
public class BotServiceImpl implements BotService {
    @Autowired
    private BotRepository botRepository;

    @Override
    public Bot getBotById(long id) {
        return botRepository.findOne(id);
    }

    @Override
    public List<Bot> getAllBots() {
        return botRepository.findAll();
    }
}
