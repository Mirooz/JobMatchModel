package com.jobmatcher.model.repositories;

import com.jobmatcher.model.models.LinkedinJobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkedinJobsRepository extends JpaRepository<LinkedinJobs, Long> {
    // Vous pouvez ajouter des méthodes personnalisées ici si nécessaire
}