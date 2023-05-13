package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.status;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import com.samsung.android.sdk.accessory.example.helloaccessory.sap.httprequest.HttpRequest;
import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;
import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.VehicleManager;

public class SentCommandStatus extends EndPoint {
    public SentCommandStatus() throws MalformedURLException {
    }

    public static String getSentCommandStatus() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(HttpRequest.createGetRequest(VehicleManager.currentVehicle.getLastCommandRef().split("vehicles")[1],"requestdetailresponse"));
        return getCommand(json)+" "+getInvokeStatus(json);
    }

    private static String getInvokeStatus(JSONObject json) throws JSONException {
        return json.has("data") ? json.getJSONObject("data").getString("invokeStatus"): "No data available from server";
    }

    private static String getCommand(JSONObject json) throws JSONException {
        return json.has("data") ? json.getJSONObject("data").getString("command"): "No data available from server";
    }

}
