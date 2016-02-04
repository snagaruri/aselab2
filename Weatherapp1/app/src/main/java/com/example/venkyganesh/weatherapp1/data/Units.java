package com.example.venkyganesh.weatherapp1.data;

import org.json.JSONObject;

/**
 * Created by venky@ganesh on 04-02-2016.
 */
public class Units implements JSONpopulator {

    private String temperature;

    public String getTemperature() {
        return temperature;
    }
    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");

    }
}
