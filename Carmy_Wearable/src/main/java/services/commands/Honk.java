package services.commands;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;

public class Honk extends EndPoint {

    public Honk() throws MalformedURLException {
    }

    public static String honk() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(HttpRequest.createHttpPost(VIN + "/commands/honk",""));
        return json.getJSONObject("async").getString("status");
    }

}
