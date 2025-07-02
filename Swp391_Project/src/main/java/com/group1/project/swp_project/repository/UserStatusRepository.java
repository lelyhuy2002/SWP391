package com.group1.project.swp_project.repository;

import com.group1.project.swp_project.entity.UserStatus;
import com.group1.project.swp_project.entity.Users;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStatusRepository extends JpaRepository<UserStatus, Integer> {
  Optional<UserStatus> findByStatusName(String statusName);

  @Query("SELECT u FROM Users u JOIN u.role r WHERE r.roleName = :roleName")
  List<Users> findByRole(@Param("roleName") String roleName);
}
