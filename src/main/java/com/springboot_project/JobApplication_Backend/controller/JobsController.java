package com.springboot_project.JobApplication_Backend.controller;

import com.springboot_project.JobApplication_Backend.model.Jobs;
import com.springboot_project.JobApplication_Backend.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class JobsController {
    @Autowired
    JobsService service;

    @RequestMapping("/")
    public String defController()
    {
        return "Job Application Backend is Running Successfully";
    }
    @GetMapping("/getjobs")
    public List<Jobs> getJobs()
    {
        return service.getJobs();
    }
    @GetMapping("/getjobs/id/{jobId}")
    public Optional<Jobs> findByJobId(@PathVariable int jobId)
    {
        return service.findByJobId(jobId);
    }
    @GetMapping("/getjobs/name/{jobName}")
    public List<Jobs> findByJobName(@PathVariable String jobName)
    {
        return service.findByJobName(jobName);
    }
    @GetMapping("/getjobs/keyword/{keyword}")
    public List<Jobs> getJobsByKeyWord(@PathVariable String keyword)
    {
        return service.findByKeyWord(keyword);
    }
    @PostMapping("/addjob")
    public void addJob(@RequestBody Jobs job)
    {
        service.addJob(job);
    }
    @PostMapping("/addjobs")
    public void addJobs(@RequestBody List<Jobs> jobsList)
    {
        service.addJobs(jobsList);
    }
    @GetMapping("/getjobs-by-jobpay/{min}/{max}")
    public List<Jobs> findByJobPay(@PathVariable int min,
                                   @PathVariable int max)
    {
        return service.findByJobPay(min,max);
    }
    @PutMapping("/update-job")
    public void updateJob(@RequestBody Jobs job)
    {
        service.updateJob(job);
    }
    @DeleteMapping("/delete-job/{jobId}")
    public void deleteJob(@PathVariable int jobId)
    {
        service.deleteJob(jobId);
    }
}
