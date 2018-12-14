package com.mufakose.students.marksapi.repository;

import com.mufakose.students.marksapi.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by mumu on 2/12/2018.
 */
public interface MarkRepository extends JpaRepository<Mark, Long> {
    public List<Mark> findByDateRecorded(Date dateRecorded);
}
