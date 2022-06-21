package com.app.efa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.efa.Entity.Job;

@Repository
public interface JobRepo extends JpaRepository<Job, Long> {

}
