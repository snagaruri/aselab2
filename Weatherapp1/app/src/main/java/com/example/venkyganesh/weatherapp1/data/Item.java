package com.example.venkyganesh.weatherapp1.data;

import org.json.JSONObject;

/**
 * Created by venky@ganesh on 04-02-2016.
 */
public class Item implements JSONpopulator {

    private Condition condition;

    public Condition getCondition() {
        return condition;
    }
    @Override
    public void populate(JSONObject data) {
        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));

    }
}
