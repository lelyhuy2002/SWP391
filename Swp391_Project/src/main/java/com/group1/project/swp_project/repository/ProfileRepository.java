package com.group1.project.swp_project.repository;

import com.group1.project.swp_project.entity.Profile;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
  Optional<Profile> findByUserId(int id); // đúng vì Profile có trường user
}
