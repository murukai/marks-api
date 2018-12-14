package com.mufakose.students.marksapi.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mumu on 2/12/2018.
 */
@Entity
public class StudentForm {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int capacity;

    @ManyToOne
    private Level level;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Student> students;

    public StudentForm() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentForm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
