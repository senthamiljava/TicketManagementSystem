package com.revature.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.tms.model.Ticket;
import com.revature.tms.model.TicketStatus;
import com.revature.tms.repository.TicketRepository;
import com.revature.tms.repository.TicketStatusRepository;

@CrossOrigin
@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	TicketRepository ticketRepository;

	@Autowired
	TicketStatusRepository ticketStatusRepository;

	@PostMapping
	public Ticket save(@RequestBody Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@GetMapping

	public List<Ticket> findAll() {
		return ticketRepository.findAll();
	}

	@GetMapping("/user/{id}")

	public List<Ticket> findByUserId(@PathVariable("id") Integer id) {
		System.out.println("find by userId");
		return ticketRepository.findByUserId(id);
	}

	@PostMapping("/{id}/{statusId}")

	public Ticket update(@PathVariable("id") Integer id, @PathVariable("statusId") Integer statusId) {
		Ticket ticket = ticketRepository.findOne(id);
		TicketStatus status = ticketStatusRepository.findOne(statusId);
		ticket.setTicketStatus(status);
		return ticketRepository.save(ticket);

	}
}
