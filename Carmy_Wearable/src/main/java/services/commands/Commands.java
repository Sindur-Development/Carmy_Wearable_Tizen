package services.commands;


import org.json.JSONException;

import java.io.IOException;
import java.net.MalformedURLException;

import services.EndPoint;


public class Commands extends EndPoint {
    public Commands() throws MalformedURLException {
    }

    public static String getCommands() throws IOException, JSONException, InterruptedException {
//        JSONObject json = new JSONObject(HttpRequest.createRequest(VIN + "/commands"));
        return ""; //json.getJSONObject("data").getJSONObject("odometer").getString("unit").equals("kilometers")?"km":"mi";
    }

}
