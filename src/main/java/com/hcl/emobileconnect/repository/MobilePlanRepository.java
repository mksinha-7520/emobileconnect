package com.hcl.emobileconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcml.emobileconnect.entity.MobilePlan;

@Repository
public interface MobilePlanRepository extends JpaRepository<MobilePlan, Integer> {

}
