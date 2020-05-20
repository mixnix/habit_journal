package com.github.mixnix.habit_journal.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityDto {
    private String activityCategory;

    private String description;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
