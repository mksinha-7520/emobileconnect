package com.hcml.emobileconnect.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "REQUEST")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Request {
	
	@Id
	@GeneratedValue
	@Column(name = "request_id")
	private Integer requestId;
	
	@OneToOne
	@JoinColumn(name = "cust_id")
	//@Column(name = "customer_id")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name = "plan_id")
	//@Column(name = "plan_id")
	private MobilePlan mobilePlan;
	
	@Column(name = "mobile_number")
	private Long mobileNumber;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "comments")
	private String comments;

}
