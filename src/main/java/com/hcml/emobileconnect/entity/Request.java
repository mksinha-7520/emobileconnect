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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

	public Integer getRequestId() {
		return requestId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public MobilePlan getMobilePlan() {
		return mobilePlan;
	}

	public void setMobilePlan(MobilePlan mobilePlan) {
		this.mobilePlan = mobilePlan;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	

}
