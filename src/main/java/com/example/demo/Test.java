package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Test {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String subject;
    private String date;
    private float score;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="student_id")
    private Student student;

    public Test() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
