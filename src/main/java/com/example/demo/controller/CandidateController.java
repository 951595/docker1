package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Candidate;
import com.example.demo.repository.CandidateRepository;

@RestController
public class CandidateController {
	@Autowired
	private CandidateRepository candidateRepository;
	@GetMapping("/candidates")
	public List<Candidate>getAllCandidates(){
		return candidateRepository.findAll();
	}
	@GetMapping("/candidates/{id}")
	public Optional<Candidate> getCandidateById(@PathVariable int id) {
		return candidateRepository.findById(id);
	}
	@PostMapping("/candidate")
	public Candidate saveCandidate(@RequestBody Candidate candidate) {
		return candidateRepository.save(candidate);
	}

}
