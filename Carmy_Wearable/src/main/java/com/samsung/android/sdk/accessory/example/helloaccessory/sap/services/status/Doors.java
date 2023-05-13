package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.status;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import com.samsung.android.sdk.accessory.example.helloaccessory.sap.httprequest.HttpRequest;
import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;


public class Doors extends EndPoint {
    public Doors() throws MalformedURLException {
    }

    public static JSONObject getDoorStatus() throws IOException, JSONException, InterruptedException {
        JSONObject json = new JSONObject(HttpRequest.createGetRequest(VIN + "/doors"));
        return json;
    }

}
