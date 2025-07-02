package com.group1.project.swp_project.repository;

import com.group1.project.swp_project.entity.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultantRepository
    extends JpaRepository<Consultant, Long>, JpaSpecificationExecutor<Consultant> {}
