package com.spring_boot.spring_boot_tutorial.repository;

import com.spring_boot.spring_boot_tutorial.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
