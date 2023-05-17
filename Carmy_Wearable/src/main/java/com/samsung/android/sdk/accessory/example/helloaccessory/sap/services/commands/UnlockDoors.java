package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.commands;

import com.samsung.android.sdk.accessory.example.helloaccessory.sap.ConsumerService;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import com.samsung.android.sdk.accessory.example.helloaccessory.sap.httprequest.HttpRequest;
import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;
import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.VehicleManager;

public class UnlockDoors extends EndPoint {

    public UnlockDoors() throws MalformedURLException {
    }

    public static String unlockDoors() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(HttpRequest.createHttpPost(VIN + "/commands/unlock","{\"unlockDuration\":120}"));
        VehicleManager.currentVehicle.setLastCommandRef(json.getJSONObject("async").getString("href"));
        if (json.getString("status").equals("202")){
            VehicleManager.currentVehicle.setLocked(false);
            System.out.println(VehicleManager.consumerService.sendData("Unlocked"));

        }
        return json.getString("status");
    }

}
