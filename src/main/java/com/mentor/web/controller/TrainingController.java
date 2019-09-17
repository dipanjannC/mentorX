package com.mentor.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.web.model.Trainings;
import com.mentor.web.service.TrainingService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 36000)
@RestController
@RequestMapping("/trainings")
public class TrainingController {

	@Autowired
	private TrainingService trainingService;

	@PostMapping(value = "/new")
	public ResponseEntity<Void> postTrainings(@RequestBody Trainings trainings) {

		return trainingService.postTrainings(trainings);
	}

	@GetMapping("/trainings/all/{trainingId}")
	public Optional<Trainings> getAllDetails(@PathVariable("trainingId") long trainingId) {

		return trainingService.getAllDetails(trainingId);
	}

	@GetMapping("/completed/user/{userId}")
	public List<Trainings> getAllCompletedTrainingByUser(@PathVariable("userId") long userId) {
		return trainingService.getAllCompletedTrainingByUser(userId);
	}

	@GetMapping("/completed/mentor/{mentorId}")
	public List<Trainings> getAllCompletedTrainingMentor(@PathVariable("mentorId") long mentorId) {
		return trainingService.getAllCompletedTrainingMentor(mentorId);
	}

	@GetMapping("/current/user/{userId}")
	public List<Trainings> onProgressTrainingDetailsByUser(@PathVariable("userId") long userId) {
		return trainingService.onProgressTrainingDetailsByUser(userId);
	}

	@GetMapping("/current/mentor/{mentorId}")
	public List<Trainings> onProgressTrainingDetailsByMentor(@PathVariable("mentorId") long mentorId) {
		return trainingService.onProgressTrainingDetailsByMentor(mentorId);
	}

	@GetMapping("/finalized/{trainingId}")
	public List<Trainings> getAllFinalize(@PathVariable("trainingId") long trainingId) {
		return trainingService.getAllFinalize(trainingId);
	}

	@PutMapping("/approved/{trainingId}/{}")
	public ResponseEntity<Trainings> getAllApprove(@PathVariable("trainingId") long trainingId) {

		return trainingService.getAllApprove(trainingId);
	}

}
