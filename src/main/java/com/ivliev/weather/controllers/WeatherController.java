package com.ivliev.weather.controllers;

import com.ivliev.weather.FormData;
import com.ivliev.weather.dao.WeatherEntity;
import com.ivliev.weather.services.RequestWeatherService;
import com.ivliev.weather.services.WeatherService;
import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class WeatherController {

    RequestWeatherService requestWeatherService;
    WeatherService weatherService;

    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("formData", new FormData());
        return "index";
    }

    @PostMapping("/")
    public String getWeather(@ModelAttribute("formData") FormData formData, @RequestParam Map<String, String> parameters, Model model) throws IOException, JSONException {

        requestWeatherService.add(new WeatherEntity( formData.getCity(), LocalDateTime.now()));
        String weather =  weatherService.getWeather(formData.getCity());
        model.addAttribute("weather",weather);
        return "weather";
    }
}
