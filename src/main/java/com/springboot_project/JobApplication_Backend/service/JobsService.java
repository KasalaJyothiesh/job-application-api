package com.springboot_project.JobApplication_Backend.service;

import com.springboot_project.JobApplication_Backend.model.Jobs;
import com.springboot_project.JobApplication_Backend.repo.JobsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobsService {

    @Autowired
    JobsRepo repo;
    public void addJob(Jobs job)
    {
        repo.save(job);
    }
    public void addJobs(List<Jobs> jobsList)
    {
        repo.saveAll(jobsList);
    }
    public List<Jobs> getJobs() {
        return repo.findAll();
    }

    public Optional<Jobs> findByJobId(int jobId) {
        return repo.findById(jobId);
    }

    public List<Jobs> findByJobName(String jobName) {
        return repo.findByjobName(jobName);
    }

    public List<Jobs> findByJobPay(int min, int max) {
        return repo.findByjobPayBetween(min,max);
    }

    public List<Jobs> findByKeyWord(String keyword)
    {
        return repo.findByjobNameContaining(keyword);
    }

    public void updateJob(Jobs job) {
        repo.save(job);
    }

    public void deleteJob(int jobId)
    {
        repo.deleteById(jobId);
    }

}
