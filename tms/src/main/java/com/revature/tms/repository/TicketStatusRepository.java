package com.revature.tms.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.revature.tms.model.TicketStatus;

public interface TicketStatusRepository extends JpaRepository<TicketStatus, Integer> {

}
