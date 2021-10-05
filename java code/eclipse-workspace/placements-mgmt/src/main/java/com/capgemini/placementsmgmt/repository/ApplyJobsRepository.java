package com.capgemini.placementsmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.placementsmgmt.entities.ApplyJobs;

@Repository

public interface ApplyJobsRepository extends JpaRepository<ApplyJobs, Integer> {

}
