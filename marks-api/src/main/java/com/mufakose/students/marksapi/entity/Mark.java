package com.mufakose.students.marksapi.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mumu on 2/12/2018.
 */
@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int total;
    private int value;
    private double percentageMark;
    @Temporal(TemporalType.DATE)
    private Date dateRecorded;

    @ManyToOne
    private Subject subject;

    @ManyToOne
    private Student student;

    public Mark() {
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getPercentageMark() {
        return percentageMark;
    }

    public void setPercentageMark(double percentageMark) {
        this.percentageMark = percentageMark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getDateRecorded() {
        return dateRecorded;
    }

    public void setDateRecorded(Date dateRecorded) {
        this.dateRecorded = dateRecorded;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total=" + total +
                ", value=" + value +
                ", percentageMark=" + percentageMark +
                '}';
    }
}
