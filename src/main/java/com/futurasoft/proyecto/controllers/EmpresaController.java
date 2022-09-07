package com.futurasoft.proyecto.controllers;

import com.example.proyecto.services.Response;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpresaController {
  //El sistema devuelve responses 200 en la ruta enterprises con los siguientes verbos: GET
    @RequestMapping("enterprises")
    public Response get(){
        Response response = new Response();
        response.setCode(200);
        response.setMessage("Vervo get");
        return response;}

    //El sistema devuelve responses 200 en la ruta enterprises con los siguientes verbos: POST
    @PostMapping("enterprises")
    public Response post(){
        Response response = new Response();
        response.setCode(200);
        response.setMessage("Vervo post");
        return response;}

    //El sistema devuelve responses 200 en la ruta /enterprises/[id] con los siguientes verbos: GET
    @RequestMapping("enterprises/{id}")
    public Response getId(){
        Response response = new Response();
        response.setCode(200);
        response.setMessage("Vervo get");
        return response;}

    //El sistema devuelve responses 200 en la ruta /enterprises/[id] con los siguientes verbos: PATCH
    @PatchMapping("enterprises/{id}")
    public Response patchId(){
        Response response = new Response();
        response.setCode(200);
        response.setMessage("Vervo patch");
        return response;}

    //El sistema devuelve responses 200 en la ruta /enterprises/[id] con los siguientes verbos: DELETE
    @DeleteMapping ("enterprises/{id}")
    public Response delete(){
        Response response = new Response();
        response.setCode(200);
        response.setMessage("Vervo delete");
        return response;}
}
