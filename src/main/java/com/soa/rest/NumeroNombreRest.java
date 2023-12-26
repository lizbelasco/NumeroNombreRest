/**
 * 
 */
package com.soa.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.soa.dto.Request;
import com.soa.dto.Response;
import com.soa.dto.Respuesta;

/**
 * 
 */
@RestController
public class NumeroNombreRest {
    
    @GetMapping("/numero/{nombre}/{appat}/{apmat}")
    public ResponseEntity<Response> consultar(@PathVariable String nombre,@PathVariable String appat,@PathVariable String apmat){
        ResponseEntity<Response> re = null;
        Response response = new Response();
        Request request = new Request();
        Respuesta respuesta = new Respuesta();
        
        int contadorNombre = nombre.length();
        int contadorApP = appat.length();
        int contadorApM = apmat.length();
        
        respuesta.setNombre(contadorNombre);
        respuesta.setApellidoPaterno(contadorApP);
        respuesta.setApellidoMaterno(contadorApM);
        response.setRespuesta(respuesta);        
       
        re = new ResponseEntity<Response>(response, HttpStatus.OK);
        return re;
        
    }
}
