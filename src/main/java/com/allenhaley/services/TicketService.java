package com.allenhaley.services;

import com.allenhaley.dao.TicketDao;
import com.allenhaley.dao.TicketDaoImpl;
import com.allenhaley.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {
    private TicketDao ticketDao;

    @Autowired
    public void setTicketDao(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    @Transactional(readOnly=true)
    public List<Ticket> getAll() {
        return (ArrayList<Ticket>)ticketDao.all();
    }

    @Transactional
    public void add(Ticket t) {
        ticketDao.add(t);
    }
}
