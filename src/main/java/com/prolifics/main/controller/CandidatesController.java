package com.prolifics.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prolifics.main.exception.ResourceNotFoundException;
import com.prolifics.main.model.Candidates;
import com.prolifics.main.repository.CandidatesRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	
	@Autowired
	private CandidatesRepository candid;
	
	@GetMapping
	public List<Candidates> getAllCandidates(){
		return candid.findAll();
	}
	
	@PostMapping
	public Candidates addCandidate(@RequestBody Candidates can) {
		return candid.save(can);
	}
	@GetMapping("{mobileNumber}")
	public ResponseEntity<Candidates> getCandidate(@PathVariable long mobileNumber){
		Candidates can1 = candid.findById(mobileNumber).
				orElseThrow(()-> new ResourceNotFoundException("Candidate not exist with mobileNumber::"+mobileNumber));
		return ResponseEntity.ok(can1);
	}
}
