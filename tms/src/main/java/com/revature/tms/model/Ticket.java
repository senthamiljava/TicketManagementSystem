package com.revature.tms.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tickets")
public class Ticket {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "summary")
	private String summary;

	@Column(name = "description")
	private String description;

	@Column(name = "created_date")
	private LocalDateTime createdDate;

	@Column(name = "modified_date")
	private LocalDateTime modifiedDate;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private TicketCategory ticketCategory;

	@ManyToOne
	@JoinColumn(name = "status_id")
	private TicketStatus ticketStatus;

	@ManyToOne
	@JoinColumn(name = "reviewed_by")
	private User userReview;
}
