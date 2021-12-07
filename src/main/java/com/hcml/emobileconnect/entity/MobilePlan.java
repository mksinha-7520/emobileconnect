package com.hcml.emobileconnect.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "MOBILE_PLAN")
public class MobilePlan {
	
	@Id
	@GeneratedValue
	@Column(name = "plan_id")
	private Integer planId;
	
	@Column(name = "plan_name")
	private String planName;
	
	@Column(name = "plan_charges")
	private double planCharges;
	
	@Column(name = "plan_validity")
	private Integer planValidity;
	
	@OneToOne(mappedBy = "request")
	private Request request;

}
