package com.example.demo.Student;

import java.time.LocalDate;

public class StudentModel {
    private int id;
    private String name;
    private String email;
    private int age;
    private LocalDate date;


    public StudentModel(int id, String name, String email, int age, LocalDate date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.date = date;
    }


public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDate() {
        return date;
    }


    

}
