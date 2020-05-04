package com.github.mixnix.habit_journal.controller;

import com.github.mixnix.habit_journal.domain.dao.Activity;
import com.github.mixnix.habit_journal.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/activities")
@Slf4j
@RequiredArgsConstructor
public class ActivityController {

    private final ActivityRepository activityRepository;

    @GetMapping
    public List<Activity> getAllActivities() {
        log.info("GET /api/activities");
        return activityRepository.findAll();
    }

    @GetMapping("/{id}")
    public Activity getActivity(@PathVariable Long id) {
        log.info("GET /api/activities/{}", id);
        return activityRepository.getOne(id);
    }

    @PostMapping
    public Activity createActivity(@RequestBody @Valid Activity activity){
        log.info("POST /api/activities");
        return activityRepository.save(activity);
    }

    @PutMapping("/{id}")
    public Activity updateActivity(@RequestBody @Valid Activity activity, @PathVariable Long id){
        log.info("PUT /api/activities/{}, received data: {}", id, activity);
        activity.setId(id);
        return activityRepository.save(activity);
    }

    @DeleteMapping("/{id}")
    public void deleteActivities(@PathVariable Long id){
        log.info("DELETE /api/activities/{}", id);
        activityRepository.deleteById(id);
    }
}
