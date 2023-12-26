/**
 * 
 */
package com.soa.rest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.google.gson.Gson;
import com.soa.dto.Request;
import com.soa.dto.Response;

/**
 * 
 */
class NumeroNombreRestTest {

    @Test
    void test() {
        NumeroNombreRest numeroNombreRest = new NumeroNombreRest();
        
        Request request = new Request();
        
        request.setNombre("Lizbeth");
        request.setApellidoPaterno("Velasco");
        request.setApellidoMaterno("Ricardez");
        
        
        ResponseEntity<Response> re = numeroNombreRest.consultar(request.getNombre(), request.getApellidoPaterno(), request.getApellidoMaterno());

        Gson gson = new Gson();
        System.out.println(gson.toJson(re.getBody()));
        
        assertEquals(HttpStatus.OK, re.getStatusCode()); //VERIFICA LA PRUEBA
    }

}
