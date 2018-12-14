package com.mufakose.students.marksapi.controller;

import com.mufakose.students.marksapi.entity.StudentForm;
import com.mufakose.students.marksapi.repository.StudentFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mumu on 2/12/2018.
 */
@RestController
public class StudentFormsRestController {

    @Autowired
    private StudentFormRepository studentFormRepository;

    @RequestMapping(path = "/studentforms", method = RequestMethod.GET)
    public List<StudentForm> getStudentForms(){
        return studentFormRepository.findAll();
    }

    @RequestMapping(path = "/studentforms", method = RequestMethod.POST)
    public StudentForm addStudentForm(@RequestBody StudentForm studentForm){
        return studentFormRepository.save(studentForm);
    }

    @RequestMapping(path = "/studentforms", method = RequestMethod.PUT)
    public StudentForm updateStudentForm(@RequestBody StudentForm studentForm){
        return studentFormRepository.save(studentForm);
    }

    @RequestMapping(path = "/studentforms", method = RequestMethod.DELETE)
    public void deleteStudentForm(@RequestBody StudentForm studentForm){
        studentFormRepository.delete(studentForm);
    }

    @RequestMapping(path = "/studentforms/{studentformId}/delete", method = RequestMethod.DELETE)
    public void deleteStudentFormById(@PathVariable long studentFormId){
        studentFormRepository.deleteById(studentFormId);
    }


}
