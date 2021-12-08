package com.hcl.emobileconnect.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockRequestDispatcher;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import com.hcl.emobileconnect.repository.RequestRepository;
import com.hcml.emobileconnect.entity.MobilePlan;
import com.hcml.emobileconnect.entity.Request;
import org.springframework.test.web.servlet.MockMvc;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.BDDMockito.given;


@RunWith(SpringJUnit4ClassRunner.class)
public class ConnectionTest {
	
	
	
	MockMvc mockMvc;
	
	@InjectMocks
	private Connection connection;
	
	@Mock
	RequestRepository requestRepositoryRequest;
	
	@Before
	void before() {
		
		mockMvc = MockMvcBuilders.standaloneSetup(connection).build();
		
	}
	
	//@Test
	public void whenEndpointCalledThenGetListOfRequests() throws Exception {
		
		Request request = new Request();
		request.setRequestId(Integer.valueOf(1));
		request.setMobilePlan(new MobilePlan());
		request.setMobileNumber(Long.valueOf(1));
		request.setStatus("Assigned");
		request.setComments("ok");
		
		this.mockMvc.perform(MockMvcRequestBuilders.get("/abc/admin/requests"))
		.andExpect(MockMvcResultMatchers.status().isOk());
		
		
		List<Request> listOfRequest = new ArrayList<>();
		listOfRequest.add(request);
		
		
		
	}

}
