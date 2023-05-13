package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.status;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import com.samsung.android.sdk.accessory.example.helloaccessory.sap.httprequest.HttpRequest;
import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;

public class Temperature extends EndPoint {

    public Temperature() throws MalformedURLException {
    }

    public static String getTemperature() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(HttpRequest.createGetRequest(VIN + "/environment"));
        return json.getJSONObject("data").getJSONObject("externalTemp").getString("value")+"°";
    }

}
