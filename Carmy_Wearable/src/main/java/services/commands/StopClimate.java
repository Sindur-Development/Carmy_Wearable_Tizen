package services.commands;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;

public class StopClimate extends EndPoint {

    public StopClimate() throws MalformedURLException {
    }

    public static String stopClimate() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(HttpRequest.createHttpPost(VIN + "/commands/climatization-stop",""));
        return json.getJSONObject("async").getString("status");
    }

}
