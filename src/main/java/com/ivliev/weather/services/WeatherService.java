package com.ivliev.weather.services;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class WeatherService {
    public String getWeather(String city) throws IOException, JSONException {
        URL url = new URL(createURLString(city));
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");


        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        JSONObject obj = new JSONObject(response.toString());
        String temp = obj.getJSONObject("main").getString("temp");
        return temp;
    }

    private String createURLString(String city){
        StringBuilder url = new StringBuilder("http://api.openweathermap.org/data/2.5/weather?q=");
        url.append(city).append("&appid=cf46382cd03f63f8e0463559f1883aa6");
        return url.toString();
    }
}
