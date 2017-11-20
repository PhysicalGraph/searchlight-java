package com.smartthings.searchlight.controller;

import com.smartthings.searchlight.model.Bot;

import com.smartthings.searchlight.service.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by david on 11/2/17.
 */
@RestController
public class BotController {
    @Autowired
    private BotService mBotService;

    @RequestMapping("/api/bots")
    public List<Bot> getBot(@RequestParam(value="name", defaultValue="World") String name) {
        return mBotService.getAllBots();
    }

    @RequestMapping(value = "/api/bots/{id}", method = RequestMethod.GET)
    public Bot getBotById(@PathVariable("id") long id) {
        return mBotService.getBotById(id);
    }
}
