package com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.status;


import java.io.IOException;
import java.net.MalformedURLException;

import com.samsung.android.sdk.accessory.example.helloaccessory.sap.httprequest.HttpRequest;
import com.samsung.android.sdk.accessory.example.helloaccessory.sap.services.EndPoint;

public class EngineDiagnostic extends EndPoint {
    public EngineDiagnostic() throws MalformedURLException {
    }

    public String updateEngineDiagnostic() throws IOException, InterruptedException {
        return HttpRequest.createGetRequest(VIN + "/engine");
    }
}
