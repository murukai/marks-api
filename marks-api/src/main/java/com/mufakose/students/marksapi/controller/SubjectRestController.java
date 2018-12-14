package com.mufakose.students.marksapi.controller;

import com.mufakose.students.marksapi.entity.Subject;
import com.mufakose.students.marksapi.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mumu on 4/12/2018.
 */
@RestController
public class SubjectRestController {

    @Autowired
    private SubjectRepository subjectRepository;

    @RequestMapping(path = "/subjects", method = RequestMethod.GET)
    public List<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }

    @RequestMapping(path = "/subjects", method = RequestMethod.POST)
    public Subject addSubject(@RequestBody Subject subject){
        return subjectRepository.save(subject);
    }

    @RequestMapping(path = "/subjects", method = RequestMethod.PUT)
    public Subject updateSubject(@RequestBody Subject subject){
        return subjectRepository.save(subject);
    }

    @RequestMapping(path = "/subjects", method = RequestMethod.DELETE)
    public void deleteSubject(@RequestBody Subject subject){
        subjectRepository.delete(subject);
    }

    @RequestMapping(path = "/subjects/{subjectId}", method = RequestMethod.DELETE)
    public void deleteSubject(@PathVariable long subjectId){
        subjectRepository.deleteById(subjectId);
    }
}
