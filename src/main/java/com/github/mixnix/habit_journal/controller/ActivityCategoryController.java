package com.github.mixnix.habit_journal.controller;

import com.github.mixnix.habit_journal.domain.dao.ActivityCategory;
import com.github.mixnix.habit_journal.repository.ActivityCategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/activities-categories")
@Slf4j
@RequiredArgsConstructor
public class ActivityCategoryController {

    private final ActivityCategoryRepository activityRepository;

    @GetMapping
    public List<ActivityCategory> getAllActivitiesCategories() {
        log.info("GET /api/activities-categories");
        return activityRepository.findAll();
    }

    @GetMapping("/{id}")
    public ActivityCategory getActivityCategory(@PathVariable Long id) {
        log.info("GET /api/activities-categories/{}", id);
        return activityRepository.getOne(id);
    }

    @PostMapping
    public ActivityCategory createActivityCategory(@RequestBody @Valid ActivityCategory activity){
        log.info("POST /api/activities-categories");
        return activityRepository.save(activity);
    }

    @PutMapping("/{id}")
    public ActivityCategory updateActivityCategory(@RequestBody @Valid ActivityCategory activity,
                                                   @PathVariable Long id){
        log.info("PUT /api/activities-categories/{}, received data: {}", id, activity);
        activity.setId(id);
        return activityRepository.save(activity);
    }

    @DeleteMapping("/{id}")
    public void deleteActivityCategory(@PathVariable Long id){
        log.info("DELETE /api/activities-categories/{}", id);
        activityRepository.deleteById(id);
    }
}
