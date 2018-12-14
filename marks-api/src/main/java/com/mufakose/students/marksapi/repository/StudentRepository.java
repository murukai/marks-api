package com.mufakose.students.marksapi.repository;

import com.mufakose.students.marksapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mumu on 2/12/2018.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findByStudentID(String studentID);
    public void deleteByStudentID(String studentID);
}
