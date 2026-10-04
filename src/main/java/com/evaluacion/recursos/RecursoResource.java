package com.evaluacion.recursos;

import com.evaluacion.modelos.Recurso;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Path("/api/recurso")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RecursoResource {
    
    private static List<Recurso> recursos = new ArrayList<>();
    private static AtomicLong idCounter = new AtomicLong(1);
    
    static {
        recursos.add(new Recurso(idCounter.getAndIncrement(), "Ejemplo 1", "Descripción 1"));
        recursos.add(new Recurso(idCounter.getAndIncrement(), "Ejemplo 2", "Descripción 2"));
    }
    
    @GET
    public List<Recurso> listar() {
        return recursos;
    }
    
    @POST
    public Response crear(Recurso recurso) {
        recurso.id = idCounter.getAndIncrement();
        recursos.add(recurso);
        return Response.status(Response.Status.CREATED).entity(recurso).build();
    }
}