package com.app.efa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.efa.Entity.JobApplication;



@Repository
public interface JobApplicationRepo extends JpaRepository<JobApplication, Long> {

}
