package com.spring_boot.spring_boot_tutorial.service;

import com.spring_boot.spring_boot_tutorial.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
