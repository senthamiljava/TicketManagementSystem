package com.revature.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.tms.model.TicketCategory;
import com.revature.tms.repository.TicketCategoryRepository;

@CrossOrigin
@RestController
@RequestMapping("/category")
public class TicketCategoryController {

	@Autowired
	TicketCategoryRepository ticketCatoryRepository;

	@PostMapping
	public TicketCategory save(@RequestBody TicketCategory ticketCategory) {
		return ticketCatoryRepository.save(ticketCategory);
	}

	@GetMapping
	public List<TicketCategory> findAll() {
		return ticketCatoryRepository.findAll();
	}
}
