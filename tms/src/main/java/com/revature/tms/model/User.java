package com.revature.tms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "password")
	private String password;
	@Column(name = "is_active")
	private Integer isActive;

}
