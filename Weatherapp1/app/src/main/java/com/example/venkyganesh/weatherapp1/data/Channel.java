package com.example.venkyganesh.weatherapp1.data;
import org.json.JSONObject;
import org.json.JSONException;
/**
 * Created by venky@ganesh on 04-02-2016.
 */
public class Channel implements JSONpopulator {

    private Units units;
    private Item item;

    public Units getUnits() {
        return units;
    }

    public Item getItem() {
        return item;
    }
    @Override
    public void populate(JSONObject data) {

        units = new Units();
        units.populate(data.optJSONObject("units"));

        item = new Item();
        item.populate(data.optJSONObject("item"));



    }
}
