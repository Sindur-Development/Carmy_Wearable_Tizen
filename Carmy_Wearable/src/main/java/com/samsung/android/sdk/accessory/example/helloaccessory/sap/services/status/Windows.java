package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.status;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;


import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;


public class Windows extends EndPoint {
    public Windows() throws MalformedURLException {
    }

    public static JSONObject getWindowStatus() throws IOException, JSONException, InterruptedException {
        JSONObject json = new JSONObject(httprequest.HttpRequest.createGetRequest(VIN + "/windows"));
        return json;
    }

}
