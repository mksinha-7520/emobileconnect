package com.hcl.emobileconnect.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.emobileconnect.repository.RequestRepository;
import com.hcml.emobileconnect.entity.Request;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType; 

@RestController
@RequestMapping("abc")
public class Connection {
	
	@Autowired
	RequestRepository requestRepositoryRequest;
	
	@RequestMapping("/admin/requests")
	@Produces({ MediaType.APPLICATION_JSON })
	public @ResponseBody ResponseEntity<List<Request>> getListOfRequests() {
		
		List<Request> listOfRequests = requestRepositoryRequest.findAll();
		
		return new ResponseEntity<List<Request>>(listOfRequests, HttpStatus.OK);
		
		
	}

}
