package com.capgemini.placementsmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.placementsmgmt.entities.Education;

@Repository 
public interface EducationRepository extends JpaRepository<Education, Integer> {

}
