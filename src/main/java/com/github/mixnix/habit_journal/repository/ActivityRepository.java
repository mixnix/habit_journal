package com.github.mixnix.habit_journal.repository;

import com.github.mixnix.habit_journal.domain.dao.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository  extends JpaRepository<Activity, Long> {
}
