package com.springboot_project.JobApplication_Backend.repo;

import com.springboot_project.JobApplication_Backend.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobsRepo extends JpaRepository<Jobs,Integer> {
    List<Jobs> findByjobName(String jobName);

    List<Jobs> findByjobPayBetween(int min, int max);

    List<Jobs> findByjobNameContaining(String keyword);


}
