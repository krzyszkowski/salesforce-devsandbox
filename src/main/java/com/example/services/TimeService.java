package com.example.services;

import com.example.models.Time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/time")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class TimeService {

    @GET
    public Time get() {
        return new Time();
    }

}

