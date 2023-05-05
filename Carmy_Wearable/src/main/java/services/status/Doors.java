package services.status;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;


public class Doors extends EndPoint {
    public Doors() throws MalformedURLException {
    }

    public static JSONObject getDoorStatus() throws IOException, JSONException, InterruptedException {
        JSONObject json = new JSONObject(HttpRequest.createGetRequest(VIN + "/doors"));
        return json;
    }

}
