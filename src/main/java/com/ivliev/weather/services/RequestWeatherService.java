package com.ivliev.weather.services;

import com.ivliev.weather.dao.WeatherEntity;
import com.ivliev.weather.repositories.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestWeatherService {

    private WeatherRepo weatherRepo;
    public void add(WeatherEntity weatherEntity){
        weatherRepo.add(weatherEntity);
    }

}
