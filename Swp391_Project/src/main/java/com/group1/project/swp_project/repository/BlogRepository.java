package com.group1.project.swp_project.repository;

import com.group1.project.swp_project.entity.Blog;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
  List<Blog> findByStatus(String status);

  List<Blog> findByTopicId(Integer topicId);

  List<Blog> findByStatusAndTopicId(String status, Integer topicId);
}
