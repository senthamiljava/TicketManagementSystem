package com.revature.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.tms.model.TicketStatus;
import com.revature.tms.repository.TicketStatusRepository;

@CrossOrigin
@RestController
@RequestMapping("/status")
public class TicketStatusController {

	@Autowired
	TicketStatusRepository ticketStatusRepository;

	@PostMapping
	public TicketStatus save(@RequestBody TicketStatus ticketStatus) {
		return ticketStatusRepository.save(ticketStatus);
	}

	@GetMapping
	public List<TicketStatus> findAll() {
		return ticketStatusRepository.findAll();
	}
}
