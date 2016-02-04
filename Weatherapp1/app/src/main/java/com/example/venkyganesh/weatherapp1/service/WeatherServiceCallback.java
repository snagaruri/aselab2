package com.example.venkyganesh.weatherapp1.service;

import com.example.venkyganesh.weatherapp1.data.Channel;

/**
 * Created by venky@ganesh on 04-02-2016.
 */
public interface WeatherServiceCallback {

    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
