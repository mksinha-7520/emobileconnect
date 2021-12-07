package com.hcl.emobileconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcml.emobileconnect.entity.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {

}
