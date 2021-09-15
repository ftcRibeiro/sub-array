package com.ftribeiro.backend.controller;

import com.ftribeiro.backend.dto.MaxSumDTO;
import com.ftribeiro.backend.dto.RequestBodyDTO;
import com.ftribeiro.backend.service.ApiRestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;

@RestController
@RequestMapping("maxsum")
public class ApiRestController{

    @Autowired
    ApiRestService apiRestService;

    @PostMapping
    public ResponseEntity<MaxSumDTO> evalMaxSum(@Valid @RequestBody RequestBodyDTO body){
        MaxSumDTO response = new MaxSumDTO();
        try {

            if (body.getList().isEmpty()) {
                return ResponseEntity.badRequest().header("errors","The attribute list must be not empty").body(response);                
            }
            response = apiRestService.getMaxSum(body.getList());
            return ResponseEntity.ok(response);
            
        } catch (Exception e) {
            return ResponseEntity.badRequest().header("errors","Unexpected error ocours: " + e.getMessage()).body(null);
        }
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<String> handleMissingParameters(MissingServletRequestParameterException e) {
        String missingParameter = e.getParameterName();
        return ResponseEntity.badRequest()
                .body(missingParameter + " parameter is missing");
    }
}