package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.status;

import java.io.IOException;
import java.net.MalformedURLException;


import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;


public class FuelLevel extends EndPoint {
    public FuelLevel() throws MalformedURLException {
    }

    public String getFuelLevel() throws IOException, InterruptedException {
        return httprequest.HttpRequest.createGetRequest(VIN +"/fuel");

    }
}
