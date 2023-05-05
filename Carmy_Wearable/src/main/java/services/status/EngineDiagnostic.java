package services.status;


import java.io.IOException;
import java.net.MalformedURLException;

import httprequest.HttpRequest;
import services.EndPoint;

public class EngineDiagnostic extends EndPoint {
    public EngineDiagnostic() throws MalformedURLException {
    }

    public String updateEngineDiagnostic() throws IOException, InterruptedException {
        return HttpRequest.createGetRequest(VIN + "/engine");
    }
}
