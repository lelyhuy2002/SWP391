package com.group1.project.swp_project.dto;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BlogSummary {
  private int id;
  private String title;
  private LocalDateTime createdAt;
  private String authorName;
  private String topicName;
  private String status;
}
