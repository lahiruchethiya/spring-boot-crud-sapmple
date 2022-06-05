package com.chethiya.springbootcrudsapmple.dao;

import com.chethiya.springbootcrudsapmple.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepo extends CrudRepository<Ticket, Integer> {
}
