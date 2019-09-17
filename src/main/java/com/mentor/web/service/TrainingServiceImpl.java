package com.mentor.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mentor.web.model.Trainings;
import com.mentor.web.repository.TrainingsRepository;

@Service
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	private TrainingsRepository trainingRepository;

	@Override
	public ResponseEntity<Void> postTrainings(Trainings trainings) {
		// TODO Auto-generated method stub
		trainingRepository.save(new Trainings(trainings.getTrainingId(), trainings.getUserId(), trainings.getMentorId(),
				trainings.getSkillId(), trainings.getStatus(), trainings.getProgress(), trainings.getRating(),
				trainings.getStartTime(), trainings.getEndTime(), trainings.getStartDate(), trainings.getEndDate(),
				trainings.getAmountReceived(), trainings.getFees(), trainings.getUsername(), trainings.getMentorName(),
				trainings.getSkillName()));
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@Override
	public Optional<Trainings> getAllDetails(long trainingId) {
		// TODO Auto-generated method stub
		System.out.println("List of all Details with the Training ID :");
		Optional<Trainings> trainingDetails = trainingRepository.findById(trainingId);
		return trainingDetails;
	}

	@Override
	public List<Trainings> getAllCompletedTrainingByUser(long userId) {
		// TODO Auto-generated method stub
		System.out.println("List of all Completed training Details of User with ID: " + userId);
		List<Trainings> trainingDetails = trainingRepository.getAllCompletedTraining(userId);
		return trainingDetails;
	}

	@Override
	public List<Trainings> getAllCompletedTrainingMentor(long mentorId) {
		// TODO Auto-generated method stub
		List<Trainings> trainingDetails = trainingRepository.getAllCompletedTrainingMentor(mentorId);
		return trainingDetails;
	}

	@Override
	public List<Trainings> onProgressTrainingDetailsByUser(long userId) {
		// TODO Auto-generated method stub

		List<Trainings> trainingDetails = trainingRepository.getAllOnProgress(userId);
		return trainingDetails;
	}

	@Override
	public List<Trainings> onProgressTrainingDetailsByMentor(long mentorId) {
		// TODO Auto-generated method stub

		List<Trainings> trainingDetails = trainingRepository.getAllOnProgressMentor(mentorId);
		return trainingDetails;
	}

	@Override
	public List<Trainings> getAllFinalize(long trainingId) {
		// TODO Auto-generated method stub

		List<Trainings> trainings = trainingRepository.getAllFinalize(trainingId);
		return trainings;
	}

	@Override
	public ResponseEntity<Trainings> getAllApprove(long trainingId) {
		// TODO Auto-generated method stub

		Optional<Trainings> trainingsData = trainingRepository.findById(trainingId);

		if (trainingsData.isPresent()) {
			Trainings _trainings = trainingsData.get();
			_trainings.setStatus("approved");
			return new ResponseEntity<>(trainingRepository.save(_trainings), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
