package services.commands;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;
import services.VehicleManager;

public class UnlockDoors extends EndPoint {

    public UnlockDoors() throws MalformedURLException {
    }

    public static String unlockDoors() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(HttpRequest.createHttpPost(VIN + "/commands/unlock","{\"unlockDuration\":120}"));
        VehicleManager.currentVehicle.setLastCommandRef(json.getJSONObject("async").getString("href"));
        System.out.println(json.getJSONObject("async").getString("status"));
        return json.getString("status");
    }

}
