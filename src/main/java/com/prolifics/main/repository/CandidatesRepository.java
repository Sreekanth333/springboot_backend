package com.prolifics.main.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.prolifics.main.model.Candidates;

public interface CandidatesRepository extends JpaRepository<Candidates,Long> {

}
