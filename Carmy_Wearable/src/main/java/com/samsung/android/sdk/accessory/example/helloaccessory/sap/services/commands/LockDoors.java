package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.commands;

import org.json.JSONException;

import java.io.IOException;
import java.net.MalformedURLException;

import com.samsung.android.sdk.accessory.example.helloaccessory.sap.httprequest.HttpRequest;
import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;

public class LockDoors extends EndPoint {

    public LockDoors() throws MalformedURLException {
    }

    public static String lockDoors() throws IOException, InterruptedException, JSONException {
//        JSONObject json = new JSONObject(
        HttpRequest.createHttpPost(VIN + "/commands/lock","");
        return "";//json.getJSONObject("async").getString("status");
    }

}
