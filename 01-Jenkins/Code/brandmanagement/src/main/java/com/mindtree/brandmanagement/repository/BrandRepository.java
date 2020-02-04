package com.mindtree.brandmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.brandmanagement.entity.Brand;
@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
