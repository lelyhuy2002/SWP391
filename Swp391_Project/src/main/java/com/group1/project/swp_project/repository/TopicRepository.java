package com.group1.project.swp_project.repository;

import com.group1.project.swp_project.entity.Topic;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
  Optional<Topic> findByName(String name);
}
