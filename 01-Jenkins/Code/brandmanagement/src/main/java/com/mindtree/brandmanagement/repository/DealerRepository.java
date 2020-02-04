package com.mindtree.brandmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.brandmanagement.entity.Dealer;
@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer> {

	

	Optional<Dealer> findBydealerName(String dealerName);

}
