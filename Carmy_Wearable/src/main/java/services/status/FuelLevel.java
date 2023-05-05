package services.status;

import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;


public class FuelLevel extends EndPoint {
    public FuelLevel() throws MalformedURLException {
    }

    public String getFuelLevel() throws IOException, InterruptedException {
        return HttpRequest.createGetRequest(VIN +"/fuel");

    }
}
