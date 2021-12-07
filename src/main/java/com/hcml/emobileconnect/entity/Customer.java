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

@Entity(name = "CUSTOMER")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer  {
	
	@Id
	@GeneratedValue
	@Column(name = "cust_id")
	private Integer custId;
	
	@Column(name = "cust_name")
	private String custName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "mobile_number")
	private Long mobileNumber;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "id_proof_type")
	private String idProofType;
	
	@Column(name = "id_number")
	private String idNumber;
	
	@OneToOne(mappedBy = "customer")
	private Request request;
	
	
	

}
