package com.mufakose.students.marksapi.controller;

import com.mufakose.students.marksapi.entity.Level;
import com.mufakose.students.marksapi.entity.StudentForm;
import com.mufakose.students.marksapi.repository.LevelRepository;
import com.mufakose.students.marksapi.repository.StudentFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mumu on 2/12/2018.
 */
@RestController
public class LevelsRestController {

    @Autowired
    private LevelRepository levelRepository;

    @Autowired
    private StudentFormRepository studentFormRepository;

    @RequestMapping(path = "/levels", method = RequestMethod.GET)
    public List<Level> getLevels(){
        return levelRepository.findAll();
    }

    @RequestMapping(path = "/levels/{levelId}", method = RequestMethod.GET)
    public Level getLevel(@PathVariable long levelId){
        return levelRepository.findById(levelId).get();
    }

    @RequestMapping(path = "/levels", method = RequestMethod.POST)
    public Level addLevel(@RequestBody Level level){
        return levelRepository.save(level);
    }

    @RequestMapping(path = "/levels", method = RequestMethod.PUT)
    public Level updateLevel(@RequestBody Level level){
        return levelRepository.save(level);
    }

    @RequestMapping(path = "/levels", method = RequestMethod.DELETE)
    public void deleteLevel(@RequestBody Level level){
        levelRepository.delete(level);
    }

    @RequestMapping(path = "/levels/{levelId}/delete", method = RequestMethod.DELETE)
    public void deleteLevelById(@PathVariable long levelId){
        levelRepository.deleteById(levelId);
    }


    @RequestMapping(path = "/levels/studentforms", method = RequestMethod.GET)
    public List<StudentForm> getStudentFormInLevel(@RequestBody Level level){
        return studentFormRepository.findByLevel(level);
    }

    @RequestMapping(path = "/levels/{levelId}/studentforms", method = RequestMethod.GET)
    public List<StudentForm> getStudentFormInLevelId(@PathVariable long levelId){
        Level level = levelRepository.findById(levelId).get();
        return studentFormRepository.findByLevel(level);
    }

}
