package com.capgemini.placementsmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.placementsmgmt.entities.MyProfile;

@Repository

public interface MyProfileRepository extends JpaRepository<MyProfile, Integer> {

}
