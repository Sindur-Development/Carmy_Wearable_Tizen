package services.commands;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;
import services.VehicleManager;

public class LockDoors extends EndPoint {

    public LockDoors() throws MalformedURLException {
    }

    public static String lockDoors() throws IOException, InterruptedException, JSONException {
        JSONObject json = new JSONObject(
        HttpRequest.createHttpPost(VIN + "/commands/lock",""));
        if (json.getString("status").equals("202")){
            VehicleManager.currentVehicle.setLocked(true);
            System.out.println(VehicleManager.consumerService.sendData("Locked"));
        }
        return json.getString("status");
    }

}
