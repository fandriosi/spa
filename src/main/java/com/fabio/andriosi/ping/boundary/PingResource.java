package com.fabio.andriosi.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author airhacks.com
 */
@Produces(MediaType.APPLICATION_JSON)
@Path("ping")
public class PingResource {

    @GET
    public Ping ping() {
        return new Ping("jgus",40);
    }

}
