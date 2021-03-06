package com.mufakose.students.marksapi.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mumu on 2/12/2018.
 */
@Entity
public class Level {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public Level() {
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

    @Override
    public String toString() {
        return "Level{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
