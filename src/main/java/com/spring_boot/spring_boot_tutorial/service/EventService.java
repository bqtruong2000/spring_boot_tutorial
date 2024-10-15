package com.spring_boot.spring_boot_tutorial.service;

import com.spring_boot.spring_boot_tutorial.dto.EventDto;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
}
