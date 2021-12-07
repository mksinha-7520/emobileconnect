package com.hcl.emobileconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcml.emobileconnect.entity.Request;

public interface RequestRepository extends JpaRepository<Request, Integer> {

}
