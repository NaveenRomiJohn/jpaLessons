package com.chainsys.jpa.application.student;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface StudentMarksRepository extends CrudRepository<StudentMarks,Integer>{
	StudentMarks findById(int id);
	StudentMarks save(StudentMarks sm);
    // Used for both adding new Doctor and Modifying new Doctor
    void deleteById(int sm_id);
    List<StudentMarks> findAll();
}