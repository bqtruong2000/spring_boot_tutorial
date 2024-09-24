package com.spring_boot.spring_boot_tutorial.repository;

import com.spring_boot.spring_boot_tutorial.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {
    Optional<Club> findByTitle(String title);
}
