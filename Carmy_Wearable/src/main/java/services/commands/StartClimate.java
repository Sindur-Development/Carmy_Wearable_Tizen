package services.commands;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;

public class StartClimate extends EndPoint {

    public StartClimate() throws MalformedURLException {
    }

    public static String startClimate() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(HttpRequest.createHttpPost(VIN + "/commands/climatization-start",""));
        return json.getJSONObject("async").getString("status");
    }

}
