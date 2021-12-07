package com.hcml.emobileconnect.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "MOBILE_NUMBER")
public class MobileNumber {
	
	@Id
	@GeneratedValue
	@Column(name = "sim_id")
	private Integer simId;
	
	@Column(name = "phone_number")
	private Long phoneNumber;
	
	@Column(name = "sim_status")
	private String simStatus;

}
