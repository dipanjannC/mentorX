package com.mentor.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mentor.web.model.Trainings;

public interface TrainingsRepository extends JpaRepository<Trainings, Long> {

	
	@Query(value="SELECT * FROM trainings  WHERE trainings.status=5 AND trainings.user_id=?", nativeQuery=true)
	public List<Trainings> getAllCompletedTraining(@Param("user_id") long  user_id);
	
	
	@Query(value="SELECT * FROM trainings  WHERE trainings.status=5 AND trainings.mentor_id=?", nativeQuery=true)
	public List<Trainings> getAllCompletedTrainingMentor(@Param("mentor_id") long  mentor_id);
	
	
	@Query(value="SELECT * FROM trainings   WHERE trainings.status!=5 AND trainings.user_id=?", nativeQuery=true)
	public List<Trainings> getAllOnProgress(@Param("user_id") long  user_id);
	
	@Query(value="SELECT * FROM trainings  WHERE trainings.status!=5 AND trainings.mentor_id=?", nativeQuery=true)
	public List<Trainings> getAllOnProgressMentor(@Param("mentor_id") long  mentor_id);
	
	@Query(value="SELECT * FROM trainings   WHERE trainings.status='Finalize'", nativeQuery=true)
	public List<Trainings> getAllFinalize(@Param("trainingId") long  training_id);
	
	@Query(value="SELECT * FROM trainings   WHERE trainings.status='proposed'", nativeQuery=true)
	public List<Trainings> getAllApprove(@Param("trainingId") long  training_id);

}
