package com.adz.jokeapp.controller;

import com.adz.jokeapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokeController
{
    JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model)
    {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
