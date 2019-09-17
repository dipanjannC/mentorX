package com.mentor.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import com.mentor.web.model.Trainings;

public interface TrainingService {

	public ResponseEntity<Void> postTrainings(Trainings trainings);
	public Optional<Trainings> getAllDetails(long trainingId);
	public List<Trainings> getAllCompletedTrainingByUser(long userId);
	public List<Trainings> getAllCompletedTrainingMentor(long mentorId);
	public List<Trainings> onProgressTrainingDetailsByUser(long userId);
	public List<Trainings> onProgressTrainingDetailsByMentor(long mentorId);
	public List<Trainings> getAllFinalize(long trainingId);
	public ResponseEntity<Trainings> getAllApprove(long trainingId);
}
