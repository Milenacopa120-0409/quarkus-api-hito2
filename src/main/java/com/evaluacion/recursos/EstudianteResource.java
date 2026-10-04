package com.evaluacion.recursos;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/estudiantes")
public class EstudianteResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> listarEstudiantes() {
        return List.of("Estudiante 1", "Estudiante 2");
    }
}