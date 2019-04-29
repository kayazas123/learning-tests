package io.xstefank;

import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("ping")
public class PingResource {
    
    @GET
    public Response ping() {
        return Response.ok("Application running successfully").build();
    }

    @POST
    public String post(JsonObject jsonObject) {
        return "json :" + jsonObject.toString();
    }
}
