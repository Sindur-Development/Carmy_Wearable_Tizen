package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.commands;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;


import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;

public class StopClimate extends EndPoint {

    public StopClimate() throws MalformedURLException {
    }

    public static String stopClimate() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(httprequest.HttpRequest.createHttpPost(VIN + "/commands/climatization-stop",""));
        return json.getJSONObject("async").getString("status");
    }

}
