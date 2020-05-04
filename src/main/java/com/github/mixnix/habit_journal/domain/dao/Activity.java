package com.github.mixnix.habit_journal.domain.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
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
