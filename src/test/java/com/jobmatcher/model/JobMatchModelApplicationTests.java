package com.jobmatcher.model;

import com.jobmatcher.model.models.LinkedinJobs;
import com.jobmatcher.model.repositories.LinkedinJobsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootTest
@ComponentScan("com.jobmatcher.model.repositories.*")
class JobMatchModelApplicationTests {

	@Autowired
	private LinkedinJobsRepository linkedinJobsRepository;

	@Test
	public void testFetchAllLinkedinJobs() {
		List<LinkedinJobs> jobs = linkedinJobsRepository.findAll();
		for (LinkedinJobs job : jobs) {
			System.out.println("ID: " + job.getId());
			System.out.println("URL: " + job.getUrl());
			System.out.println("Title: " + job.getTitle());
			System.out.println("Job Description: " + job.getJobdesc());
		}
	}

}
