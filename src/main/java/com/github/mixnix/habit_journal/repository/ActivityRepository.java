package com.github.mixnix.habit_journal.repository;

import com.github.mixnix.habit_journal.domain.dao.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ActivityRepository  extends JpaRepository<Activity, Long> {
    List<Activity> getActivitiesByStartTimeAfterAndStartTimeBefore(LocalDateTime start, LocalDateTime end);
}
