package com.smartthings.searchlight.service;

import java.util.List;

import com.smartthings.searchlight.model.Bot;

/**
 * Created by david on 11/6/17.
 */
public interface BotService {
    Bot getBotById(long id);
    List<Bot> getAllBots();
}
