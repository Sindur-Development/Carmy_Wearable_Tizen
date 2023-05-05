package services.status;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;

public class Temperature extends EndPoint {

    public Temperature() throws MalformedURLException {
    }

    public static String getTemperature() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(HttpRequest.createGetRequest(VIN + "/environment"));
        return json.getJSONObject("data").getJSONObject("externalTemp").getString("value")+"°";
    }

}
