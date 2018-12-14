package com.mufakose.students.marksapi.repository;

import com.mufakose.students.marksapi.entity.Level;
import com.mufakose.students.marksapi.entity.StudentForm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mumu on 2/12/2018.
 */
public interface StudentFormRepository extends JpaRepository<StudentForm, Long> {
    public List<StudentForm> findByLevel(Level level);
}
