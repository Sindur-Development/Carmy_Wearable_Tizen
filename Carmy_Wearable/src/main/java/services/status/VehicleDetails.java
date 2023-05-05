package services.status;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;


public class VehicleDetails extends EndPoint {
    public VehicleDetails() throws MalformedURLException {
    }

    public static JSONObject getVehicleDetails() throws IOException, JSONException, InterruptedException {
        JSONObject json = new JSONObject(HttpRequest.createGetRequest(VIN,"vehicle"));
        return json;
    }

}
