package services.status;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;


public class Windows extends EndPoint {
    public Windows() throws MalformedURLException {
    }

    public static JSONObject getWindowStatus() throws IOException, JSONException, InterruptedException {
        JSONObject json = new JSONObject(HttpRequest.createGetRequest(VIN + "/windows"));
        return json;
    }

}
