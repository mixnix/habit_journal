package com.github.mixnix.habit_journal.repository;

import com.github.mixnix.habit_journal.domain.dao.ActivityCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ActivityCategoryRepository extends JpaRepository<ActivityCategory, Long> {
    Optional<ActivityCategory> findByTitle(String title);
}
