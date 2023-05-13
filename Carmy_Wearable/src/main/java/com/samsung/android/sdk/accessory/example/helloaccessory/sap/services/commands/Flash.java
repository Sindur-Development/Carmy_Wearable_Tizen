package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.commands;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import com.samsung.android.sdk.accessory.example.helloaccessory.sap.httprequest.HttpRequest;
import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;

public class Flash extends EndPoint {

    public Flash() throws MalformedURLException {
    }

    public static String flash() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(HttpRequest.createHttpPost(VIN + "/commands/flash",""));
        return json.getJSONObject("async").getString("status");
    }

}
