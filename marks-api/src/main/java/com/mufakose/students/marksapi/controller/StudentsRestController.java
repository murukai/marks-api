package com.mufakose.students.marksapi.controller;

import com.mufakose.students.marksapi.entity.Mark;
import com.mufakose.students.marksapi.entity.Student;
import com.mufakose.students.marksapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by mumu on 2/12/2018.
 */
@RestController
@RequestMapping("/students")
public class StudentsRestController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @RequestMapping(path = "/{studentID}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable String studentID){
        return studentRepository.findByStudentID(studentID);
    }

    @RequestMapping(path = "/add",method = RequestMethod.POST)
    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public Student updateStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @RequestMapping(path = "/delete", method = RequestMethod.DELETE)
    public void deleteStudent(@RequestBody Student student){
        studentRepository.delete(student);
    }

    @RequestMapping(path = "/{studentId}/delete", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable String studentID){
        studentRepository.deleteByStudentID(studentID);
    }


}
