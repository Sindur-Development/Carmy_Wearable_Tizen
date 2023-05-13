package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.status;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import com.samsung.android.sdk.accessory.example.helloaccessory.sap.httprequest.HttpRequest;
import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;


public class Tyres extends EndPoint {
    public Tyres() throws MalformedURLException {
    }

    public static String getTyresStatus() throws IOException, JSONException, InterruptedException {
        JSONObject json = new JSONObject(HttpRequest.createGetRequest(VIN + "/tyres"));
        return json.getJSONObject("data").toString();
    }

}
