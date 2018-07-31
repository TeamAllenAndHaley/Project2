package com.allenhaley.controllers;

import com.allenhaley.model.Ticket;
import com.allenhaley.services.TicketService;
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
@RequestMapping("/tickets")
@ResponseBody
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping(name="/all", produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<Ticket>> getAllTickets() {
        ArrayList<Ticket> tickets = (ArrayList<Ticket>)ticketService.getAll();

        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @PostMapping(name="/add",produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, consumes="application/json")
    public ResponseEntity<Ticket> addTicket(Ticket t) {
        Ticket ticket = ticketService.add(t);

        return new ResponseEntity<>(ticket, HttpStatus.CREATED);
    }
}
