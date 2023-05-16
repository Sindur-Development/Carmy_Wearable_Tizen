package services.commands;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;

public class LockDoors extends EndPoint {

    public LockDoors() throws MalformedURLException {
    }

    public static String lockDoors() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(
        HttpRequest.createHttpPost(VIN + "/commands/lock",""));
        return json.getString("status");
    }

}
