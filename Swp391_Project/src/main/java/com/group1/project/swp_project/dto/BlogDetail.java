package com.group1.project.swp_project.dto;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class BlogDetail {
  private int id;
  private String title;
  private String content;
  private LocalDateTime createdAt;
  private String authorName;
  private String topicName;
  private String status;
}
