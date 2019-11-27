package com.fabio.andriosi.ping.boundary;

import com.fabio.andriosi.entities.User;
import com.fabio.andriosi.session.UserFacade;
import java.util.Calendar;
import java.util.Locale;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author airhacks.com
 */
@Produces(MediaType.APPLICATION_JSON)
@Path("user")
public class UserResource {
    
    @Inject
    UserFacade uf ;    
    Calendar dt = Calendar.getInstance(Locale.getDefault());
    @GET
    public Response user() {     
        return Response.ok(uf.findAll()).build();
    }

    @POST
    public Response setUser(User user){
        uf.create(user);
        return Response.ok(uf.findAll()).build();
    }
}
