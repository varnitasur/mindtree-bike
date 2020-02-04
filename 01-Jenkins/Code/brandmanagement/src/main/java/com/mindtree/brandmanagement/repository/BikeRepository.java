package com.mindtree.brandmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.brandmanagement.entity.Bike;
@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {

}
