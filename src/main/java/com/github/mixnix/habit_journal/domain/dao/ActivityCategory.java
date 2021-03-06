package com.github.mixnix.habit_journal.domain.dao;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class ActivityCategory {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToMany
    private List<Activity> activities;

    public ActivityCategory(String title) {
        this.title = title;
    }
}
