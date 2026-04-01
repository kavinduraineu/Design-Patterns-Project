package com.example.demo.repository;

import com.example.demo.model.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface ReminderRepository extends JpaRepository<Reminder, Long> {
    List<Reminder> findByApplicationId(Long applicationId);
    List<Reminder> findByApplicationUserIdAndIsCompletedFalse(Long userId);
    List<Reminder> findByApplicationUserIdAndReminderDateLessThanEqualAndIsCompletedFalse(Long userId, LocalDate date);
}