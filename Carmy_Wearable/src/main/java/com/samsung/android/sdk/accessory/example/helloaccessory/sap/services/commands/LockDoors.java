package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.commands;

import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import services.VehicleManager;

public class LockDoors extends EndPoint {

    public LockDoors() throws MalformedURLException {
    }

    public static String lockDoors() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(
        httprequest.HttpRequest.createHttpPost(VIN + "/commands/lock",""));
        if (json.getString("status").equals("202")){
            VehicleManager.currentVehicle.setLocked(true);
            System.out.println(VehicleManager.consumerService.sendData("Locked"));
        }
        return json.getString("status");
    }

}
