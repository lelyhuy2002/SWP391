package com.group1.project.swp_project.repository;

import com.group1.project.swp_project.entity.Appointment;
import com.group1.project.swp_project.entity.Users;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
  List<Appointment> findByUser(Users user);
}
