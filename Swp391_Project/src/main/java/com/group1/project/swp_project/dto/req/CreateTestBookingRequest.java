package com.group1.project.swp_project.dto.req;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CreateTestBookingRequest {
  private Long testPackageId;
  private LocalDateTime scheduledDate;
  private String note;
  private Long consultantId;
}
