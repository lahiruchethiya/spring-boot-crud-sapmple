package com.chethiya.springbootcrudsapmple.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="Tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double amount;
    private String category;
}
