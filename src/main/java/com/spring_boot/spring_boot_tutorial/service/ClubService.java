package com.spring_boot.spring_boot_tutorial.service;

import com.spring_boot.spring_boot_tutorial.dto.ClubDto;
import com.spring_boot.spring_boot_tutorial.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();

    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(Long clubId);

    void updateClub(ClubDto club);
}
