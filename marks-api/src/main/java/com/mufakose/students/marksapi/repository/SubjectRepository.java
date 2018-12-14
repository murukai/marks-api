package com.mufakose.students.marksapi.repository;

import com.mufakose.students.marksapi.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mumu on 2/12/2018.
 */
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
