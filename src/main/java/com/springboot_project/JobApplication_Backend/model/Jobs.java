package com.springboot_project.JobApplication_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Scope("prototype")
public class Jobs {
    @Id
    private int jobId;
    private String jobName;
    private int jobExp;
    private int jobPay;
    private String jobLoc;

    public Jobs() {
    }

    public Jobs(int jobId, String jobName, int jobExp, int jobPay, String jobLoc) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobExp = jobExp;
        this.jobPay = jobPay;
        this.jobLoc = jobLoc;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public int getJobExp() {
        return jobExp;
    }

    public void setJobExp(int jobExp) {
        this.jobExp = jobExp;
    }

    public int getJobPay() {
        return jobPay;
    }

    public void setJobPay(int jobPay) {
        this.jobPay = jobPay;
    }

    public String getJobLoc() {
        return jobLoc;
    }

    public void setJobLoc(String jobLoc) {
        this.jobLoc = jobLoc;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", jobExp=" + jobExp +
                ", jobPay=" + jobPay +
                ", jobLoc='" + jobLoc + '\'' +
                '}';
    }
}
