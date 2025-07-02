package com.group1.project.swp_project.repository;

import com.group1.project.swp_project.entity.TestBooking;
import com.group1.project.swp_project.entity.Users;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestBookingRepository extends JpaRepository<TestBooking, Long> {
  List<TestBooking> findByUser(Users user);
}
