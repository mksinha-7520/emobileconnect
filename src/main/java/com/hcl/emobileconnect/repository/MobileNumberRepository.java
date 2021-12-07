package com.hcl.emobileconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcml.emobileconnect.entity.MobileNumber;

@Repository
public interface MobileNumberRepository extends JpaRepository<MobileNumber, Integer> {

}
