package com.group1.project.swp_project.repository;

import com.group1.project.swp_project.entity.TestPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestPackageRepository extends JpaRepository<TestPackage, Long> {}
