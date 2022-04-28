package com.danielzambon.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.danielzambon.hrworker.entities.Worker;

public interface WorkerRepositories extends JpaRepository<Worker, Long>{

}
