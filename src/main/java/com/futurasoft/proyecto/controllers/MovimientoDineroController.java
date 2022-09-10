package com.futurasoft.proyecto.controllers;

import com.futurasoft.proyecto.services.Response;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovimientoDineroController {

    @RequestMapping ("enterprises/{id}/movements")
    public Response get(){

        Response response = new Response();
        response.setCode(200);
        response.setMessage("Vervo get");
        return response;

    }
    @PostMapping("enterprises/{id}/movements")
    public Response post(){

        Response response = new Response();
        response.setCode(200);
        response.setMessage("Vervo post");
        return response;

    }
    @PatchMapping("enterprises/{id}/movements")
    public Response patch(){

        Response response = new Response();
        response.setCode(200);
        response.setMessage("Vervo patch");
        return response;

    }

    @DeleteMapping("enterprises/{id}/movements")
    public Response delete(){

        Response response = new Response();
        response.setCode(200);
        response.setMessage("Vervo delete");
        return response;

    }
}
