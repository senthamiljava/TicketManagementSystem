package com.revature.tms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.tms.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
   
	   public List<Ticket> findByUserId(Integer id);
}
