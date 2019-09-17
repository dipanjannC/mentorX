package com.mentor.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mentor.web.model.Mentor;

public interface MentorRepository extends JpaRepository<Mentor, Long> {

}
