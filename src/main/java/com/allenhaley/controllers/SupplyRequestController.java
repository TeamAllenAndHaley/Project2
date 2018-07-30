package com.allenhaley.controllers;

import com.allenhaley.model.SupplyRequest;
import com.allenhaley.services.SupplyRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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

    @GetMapping(path="/all", produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<SupplyRequest>> getAllRequests() {
        List<SupplyRequest> requests = requestService.listSupplyRequest();

        return new ResponseEntity<>(requests, HttpStatus.OK);
    }

    @PostMapping(path="/add",produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, consumes="application/json")
    public ResponseEntity<SupplyRequest> addRequest(SupplyRequest request) {
        SupplyRequest supplyRequest = requestService.saveSupplyRequest(request);

        return new ResponseEntity<>(supplyRequest, HttpStatus.CREATED);
    }

    @GetMapping(path="/requests", produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<SupplyRequest>> getRequestsByEmployeeId(int id) {
        ArrayList<SupplyRequest> requests = requestService.getSupplyRequestsById(id);

        return new ResponseEntity<>(requests, HttpStatus.OK);
    }
}
