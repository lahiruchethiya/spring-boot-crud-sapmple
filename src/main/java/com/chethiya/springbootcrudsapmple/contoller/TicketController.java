package com.chethiya.springbootcrudsapmple.contoller;

import com.chethiya.springbootcrudsapmple.dao.TicketRepo;
import com.chethiya.springbootcrudsapmple.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketRepo repo;

    @PostMapping("/book")
    public String bookTicket(@RequestBody Ticket ticket) {
       repo.save(ticket);
        return "tickets booked";
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets() {
        return (List<Ticket>) repo.findAll();
    }
}
