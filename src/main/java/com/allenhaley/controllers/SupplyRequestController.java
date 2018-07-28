package com.allenhaley.controllers;

import com.allenhaley.model.SupplyRequest;
import com.allenhaley.services.SupplyRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/supplyRequests")
@ResponseBody
public class SupplyRequestController {

    private SupplyRequestService requestService;

    @Autowired
    public void setSupplyRequestService(SupplyRequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping(path="/all", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SupplyRequest>> getAllRequests() {
        List<SupplyRequest> requests = requestService.listSupplyRequest();

        return new ResponseEntity<>(requests, HttpStatus.OK);
    }
}
