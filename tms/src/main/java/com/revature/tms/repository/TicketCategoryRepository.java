package com.revature.tms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.tms.model.TicketCategory;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {

}
