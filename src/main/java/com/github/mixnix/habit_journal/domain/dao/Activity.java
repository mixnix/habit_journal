package com.github.mixnix.habit_journal.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private ActivityCategory activityCategory;

    private String description;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

}
