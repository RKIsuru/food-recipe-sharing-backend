package com.rkisuru.fitnesshub.repository;

import com.rkisuru.fitnesshub.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

    Optional<Workout> findById(Long id);
}
