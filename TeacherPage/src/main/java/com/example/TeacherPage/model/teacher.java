package com.example.TeacherPage.model;

import jakarta.persistence.*;

@Entity
@Table(name = "teachers")
public class teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String subject;
    private int experience;

    public teacher() {}

    public teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }
}
